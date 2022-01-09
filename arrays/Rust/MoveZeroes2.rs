fn move_zeroes(nums: &mut Vec<i32>) {
    let len = nums.len();

    nums.retain(|&x| x != 0);

    nums.resize(len, 0)
}

fn main() {
    let mut nums: Vec<i32> = vec![1,2,0,3,0,4,0];
    move_zeroes(&mut nums);
    println!("{:?}", nums);
}