pub fn move_zeroes(nums: &mut Vec<i32>) -> () {
    let (mut i, mut zeros) = (0, 0);
    while i < nums.len() - zeros {
        let count = nums[i..].iter().take_while(|&&n| n == 0).count();

        println!("{:?}", count);
        
        nums[i..].rotate_left(count);
        zeros += count;
        i += 1;
    }
}

fn main() {
    let mut nums: Vec<i32> = vec![1,2,0,3,0,4,0];
    move_zeroes(&mut nums);
}

