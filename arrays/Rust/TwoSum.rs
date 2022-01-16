fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
    let iter_nums = nums.iter().enumerate();                                                                              
    for (idx, el) in iter_nums {                                                                                          
        for (idj, ej) in nums[(idx + 1)..].iter().enumerate() {                                                                     if ej + el == target {                                                                                        
            return vec![idx as i32, (idj + idx + 1) as i32];                                                       
            }                                                                                                             
         }                                                                                                                
      }                                                                                                                     
      return nums;
}

fn main() {
    let mut nums: Vec<i32> = vec![2, 7, 11, 15];
    two_sum(nums, 9);
}
