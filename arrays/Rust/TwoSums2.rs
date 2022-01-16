fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
    use std::collections::HashMap;

    let mut map = HashMap::with_capacity(nums.len());
    for (i, num) in nums.into_iter().enumerate() {
        if let Some(&j) = map.get(&(target - num)) {
            return vec![i as i32, j as i32];
        } else {
            map.insert(num, i);
        }
    }

    vec![]
}

fn main() {
    let mut nums: Vec<i32> = vec![2, 7, 11, 15];
    two_sum(nums, 9);
}
