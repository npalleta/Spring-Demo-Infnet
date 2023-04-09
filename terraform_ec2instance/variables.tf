variable "access_key" {
  description = "Access key to AWS console"
}

variable "secret_key" {
  description = "Secret key to AWS console"
}

variable "instance_name" {
  description = "Name of the instance to be created"
  default     = "npml-ubuntu"
}

variable "instance_type" {
  default = "t2.micro"
}

variable "subnet_id" {
  description = "The VPC subnet the instance(s) will be created in"
  default     = "subnet-0198609b267eecde9"
}

variable "ami_id" {
  description = "The AMI to use"
  default     = "ami-007855ac798b5175e"
}

variable "number_of_instances" {
  description = "number of instances to be created"
  default     = 1
}

variable "ami_key_pair_name" {
  default = "ec2-npml-key-pair"
}

variable "tag_name" {
  default = "infnet-ec2"
}
