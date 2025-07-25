--  OpenAPI Petstore
--  This is a sample server Petstore server. For this sample, you can use the api key `special_key` to test the authorization filters.
--
--  The version of the OpenAPI document: 1.0.0
--
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.15.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.

package body Samples.Petstore.Models is
   pragma Style_Checks ("-bmrIu");

   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;


   function To_AnotherStatus_Type (Value : in String) return Samples.Petstore.Models.AnotherStatus_Type is
   begin
      if Value = "available" then
         return AVAILABLE;
      end if;
      if Value = "pending" then
         return PENDING;
      end if;
      if Value = "sold" then
         return UNAVAILABLE;
      end if;
      raise Constraint_Error;
   end To_AnotherStatus_Type;

   function To_String (Value : in Samples.Petstore.Models.AnotherStatus_Type) return String is
   begin
      case Value is
         when AVAILABLE =>
            return "available";

         when PENDING =>
            return "pending";

         when UNAVAILABLE =>
            return "sold";

      end case;
   end To_String;
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.AnotherStatus_Type) is
   begin
      Into.Write_Entity (Name, To_String (Value));   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AnotherStatus_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.AnotherStatus_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Value := To_AnotherStatus_Type (Swagger.To_String (Object));
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out AnotherStatus_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.AnotherStatus_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.ApiResponse_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Code.Is_Null then
         Into.Write_Entity ("code", Value.Code);
      end if;
      if not Value.P_Type.Is_Null then
         Into.Write_Entity ("type", Value.P_Type);
      end if;
      if not Value.Message.Is_Null then
         Into.Write_Entity ("message", Value.Message);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ApiResponse_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.ApiResponse_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "code", Value.Code);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "message", Value.Message);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out ApiResponse_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.ApiResponse_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.Category_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.Name.Is_Null then
         Into.Write_Entity ("name", Value.Name);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Category_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.Category_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Category_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.Category_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.Order_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.Pet_Id.Is_Null then
         Into.Write_Entity ("petId", Value.Pet_Id);
      end if;
      if not Value.Quantity.Is_Null then
         Into.Write_Entity ("quantity", Value.Quantity);
      end if;
      if not Value.Ship_Date.Is_Null then
         Into.Write_Entity ("shipDate", Value.Ship_Date);
      end if;
      if not Value.Status.Is_Null then
         Into.Write_Entity ("status", Value.Status);
      end if;
      if not Value.Complete.Is_Null then
         Into.Write_Entity ("complete", Value.Complete);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Order_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.Order_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "petId", Value.Pet_Id);
      Swagger.Streams.Deserialize (Object, "quantity", Value.Quantity);
      Swagger.Streams.Deserialize (Object, "shipDate", Value.Ship_Date);
      Swagger.Streams.Deserialize (Object, "status", Value.Status);
      Swagger.Streams.Deserialize (Object, "complete", Value.Complete);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Order_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.Order_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.PropertyNameMapping_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.P_HTTPDebugOperation.Is_Null then
         Into.Write_Entity ("http_debug_operation", Value.P_HTTPDebugOperation);
      end if;
      if not Value.P_UnderscoreType.Is_Null then
         Into.Write_Entity ("_type", Value.P_UnderscoreType);
      end if;
      if not Value.P_Type.Is_Null then
         Into.Write_Entity ("type", Value.P_Type);
      end if;
      if not Value.P_TypeWithUnderscore.Is_Null then
         Into.Write_Entity ("type_", Value.P_TypeWithUnderscore);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PropertyNameMapping_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.PropertyNameMapping_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "http_debug_operation", Value.P_HTTPDebugOperation);
      Swagger.Streams.Deserialize (Object, "_type", Value.P_UnderscoreType);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "type_", Value.P_TypeWithUnderscore);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out PropertyNameMapping_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.PropertyNameMapping_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.Tag_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.Name.Is_Null then
         Into.Write_Entity ("name", Value.Name);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Tag_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.Tag_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Tag_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.Tag_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.User_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      if not Value.Username.Is_Null then
         Into.Write_Entity ("username", Value.Username);
      end if;
      if not Value.First_Name.Is_Null then
         Into.Write_Entity ("firstName", Value.First_Name);
      end if;
      if not Value.Last_Name.Is_Null then
         Into.Write_Entity ("lastName", Value.Last_Name);
      end if;
      if not Value.Email.Is_Null then
         Into.Write_Entity ("email", Value.Email);
      end if;
      if not Value.Password.Is_Null then
         Into.Write_Entity ("password", Value.Password);
      end if;
      if not Value.Phone.Is_Null then
         Into.Write_Entity ("phone", Value.Phone);
      end if;
      if not Value.User_Status.Is_Null then
         Into.Write_Entity ("userStatus", Value.User_Status);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in User_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.User_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
      Swagger.Streams.Deserialize (Object, "firstName", Value.First_Name);
      Swagger.Streams.Deserialize (Object, "lastName", Value.Last_Name);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "password", Value.Password);
      Swagger.Streams.Deserialize (Object, "phone", Value.Phone);
      Swagger.Streams.Deserialize (Object, "userStatus", Value.User_Status);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out User_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.User_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Samples.Petstore.Models.Pet_Type) is
   begin
      Into.Start_Entity (Name);
      if not Value.Id.Is_Null then
         Into.Write_Entity ("id", Value.Id);
      end if;
      Serialize (Into, "category", Value.Category);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "photoUrls", Value.Photo_Urls);
      Serialize (Into, "tags", Value.Tags);
      if not Value.Status.Is_Null then
         Into.Write_Entity ("status", Value.Status);
      end if;
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Pet_Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out Samples.Petstore.Models.Pet_Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Deserialize (Object, "category", Value.Category);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "photoUrls", Value.Photo_Urls);
      Deserialize (Object, "tags", Value.Tags);
      Swagger.Streams.Deserialize (Object, "status", Value.Status);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Pet_Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : Samples.Petstore.Models.Pet_Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;


end Samples.Petstore.Models;
