package com.apiescuelanueva.controller;

import com.apiescuelanueva.entity.ApoderadoEntity;
import com.apiescuelanueva.service.ApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
	@Autowired
	private ApoderadoService apoderadoservice;
	
	 @GetMapping
	    public List<ApoderadoEntity>findAll(){
	        return apoderadoservice.findAll();
	    }
	    
	    @GetMapping("/custom")
	    public List<ApoderadoEntity>findAllCustom(){
	        return apoderadoservice.findAllCustom();
	    }
	    
	    @GetMapping("/{id}")
	    public Optional<ApoderadoEntity>findById(@PathVariable Long id){
	        return apoderadoservice.findById(id);
	    }
	    
	    @PostMapping
	    public ApoderadoEntity add (@RequestBody ApoderadoEntity a ){
	        return apoderadoservice.add(a);
	    }
	    
	    @PutMapping("/{id}")
		public ApoderadoEntity update (@PathVariable Long id,@RequestBody ApoderadoEntity a){
			a.setCodigo(id);
			return apoderadoservice.update(a);
		}
		
		@DeleteMapping("/{id}")
		public ApoderadoEntity delete (@PathVariable Long id){
			ApoderadoEntity objapoderado= new ApoderadoEntity(); 
			objapoderado.setEstado(false);
			return apoderadoservice.delete(ApoderadoEntity.builder().codigo(id).build());
		}
		

}
