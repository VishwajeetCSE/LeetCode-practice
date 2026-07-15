class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        if dividend== -2147483648 and divisor ==-1 :
            return 2147483647 

        negative = (dividend < 0) != (divisor < 0)

        dividend = abs(dividend)
        divisor = abs(divisor)

        quotient = 0

        while dividend >= divisor:

            temp = divisor
            multiple = 1

            while dividend >= temp + temp:
                temp += temp
                multiple += multiple

            dividend -= temp
            quotient += multiple

        return -quotient if negative else quotient


        # if (divisor>=0 and dividend>=0) or (divisor<0 and dividend<0) :  # <--- this is my own solution
        #     quotient=dividend//divisor
        #     return quotient if quotient!= 2147483648 else 2147483647

        # else:
        #     return -(-dividend//divisor)


    #     if divisor ==1 :
    #         return dividend

    #     if (divisor>=0 and dividend>=0) or (divisor<0 and dividend<0) :
    #         divisor = abs(divisor)
    #         dividend= abs(dividend)
    #         return self.positive_division( dividend, divisor)

    #     else:
    #         divisor = abs(divisor)
    #         dividend= abs(dividend)
    #         return -1*self.positive_division( dividend, divisor)
    

    # def positive_division( self, dividend, divisor):
        
    #     counter=0

    #     while dividend >= divisor:
    #             dividend-= divisor
    #             counter+= 1
    #     return counter