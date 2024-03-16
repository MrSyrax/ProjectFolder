resource "aws_instance" "test_box" {
    count = contains(["ppd","prd"], var.create) ? 1: 0
    ami = "ami-08a52ddb321b32a8c"
    subnet_id = "subnet-072447b039e759232"
    instance_type = "t2.micro"

}