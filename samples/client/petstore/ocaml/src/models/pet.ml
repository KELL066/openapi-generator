(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Pet.t : A pet for sale in the pet store
 *)

type t = {
      id: int64
          
           option [@default None]
        
        ; [@key "id"]
      category: Category.t
          
           option [@default None]
        
        ; [@key "category"]
      name: string
          
          
        
        ; [@key "name"]
      photo_urls: string list
        
        ; [@key "photoUrls"]
      tags: Tag.t list
         [@default []]
        ; [@key "tags"]
    (* pet status in the store *)
      status: Enums.pet_status
           option [@default
            
            None
          ]
        ; [@key "status"]
} [@@deriving yojson { strict = false }, show, eq ];;

(** A pet for sale in the pet store *)
let create (name : string) (photo_urls : string list) : t = {
    id = None;
    category = None;
    name = name;
    photo_urls = photo_urls;
    tags = [];
    status = None;
}

