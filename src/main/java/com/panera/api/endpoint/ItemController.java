package com.panera.api.endpoint;

import com.panera.api.domain.FoodReport;
import com.panera.api.domain.item.Item;
import com.panera.api.domain.item.MyObject;
import com.panera.api.domain.item.ResponseReportObject;
import com.panera.api.service.FoodReportService;
import com.panera.api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by sjain on 12/25/17.
 */

@RestController
@RequestMapping("/items/v1")
public class ItemController {

    ItemService itemService;
    FoodReportService foodReportService;

    @Autowired
    public ItemController(ItemService itemService, FoodReportService foodReportService) {
        this.itemService = itemService;
        this.foodReportService = foodReportService;
    }

    @GetMapping()
    public ResponseEntity<List<Item>> getFoodReport(){
        return new ResponseEntity<List<Item>>( itemService.getItemReport(), HttpStatus.OK);
    }


    @GetMapping(value="/all")
    public ResponseEntity<List<FoodReport>> getFoodReportInArray(@RequestParam(value="queryId", required = false) String queryId,
                                                                 @RequestParam(value = "format", required = false) String format,
                                                                 @RequestParam(value = "layout", required = false) String layout){

        List<FoodReport> foodReportFlat = foodReportService.getFoodReportFlat();
        return new ResponseEntity<List<FoodReport>>( foodReportFlat, HttpStatus.OK);
    }


//    @GetMapping(value="/filtered-report")
//    public ResponseEntity<List<ResponseReportObject>> getFilteredFoodReportInArray(@RequestParam(value="queryId", required = false) String queryId,
//                                                                                   @RequestParam(value = "format", required = false) String format,
//                                                                                   @RequestParam(value = "layout", required = false) String layout){
//
//        List<FoodReport> foodReportFlat = foodReportService.getFoodReportFlat();
//        return new ResponseEntity<List<MyObject>>( foodReportFlat, HttpStatus.OK);
//    }

    @PostMapping(value = "/filter")
    public MyObject createFoodReportQueryString(@RequestParam(value = "storeNumber",required = false) boolean storeNumber,
                                                @RequestParam(value ="id",required = false) boolean id,
                                                @RequestParam(value ="name",required = false) boolean name,
                                                @RequestParam(value ="descriptipon",required = false) boolean descriptipon,
                                                @RequestParam(value ="bussinessDate",required = false) boolean bussinessDate,
                                                @RequestParam(value ="itemId",required = false) boolean itemId,
                                                @RequestParam(value ="itemCode",required = false) boolean itemCode,
                                                @RequestParam(value ="itemDescription",required = false) boolean itemDescription,
                                                @RequestParam(value ="itemMajorCategoryId",required = false) boolean itemMajorCategoryId,
                                                @RequestParam(value ="itemMajorCategoryDescription",required = false) boolean itemMajorCategoryDescription,
                                                @RequestParam(value ="itemIdUserTypeDescription",required = false) boolean itemIdUserTypeDescription,
                                                @RequestParam(value ="itemUserTypeCode",required = false) boolean itemUserTypeCode,
                                                @RequestParam(value ="itemcategoryDescription",required = false) boolean itemcategoryDescription,
                                                @RequestParam(value ="CNTGroupName",required = false) boolean CNTGroupName,
                                                @RequestParam(value ="theoriticalQuantity",required = false) boolean theoriticalQuantity,
                                                @RequestParam(value ="allowedTargetLeftOverQuantity",required = false) boolean allowedTargetLeftOverQuantity,
                                                @RequestParam(value ="actualQuantity",required = false) boolean actualQuantity,
                                                @RequestParam(value ="purchaseQuantity",required = false) boolean purchaseQuantity,
                                                @RequestParam(value ="transferQuantity",required = false) boolean transferQuantity,
                                                @RequestParam(value ="beginningInvoiceCount",required = false) boolean beginningInvoiceCount,
                                                @RequestParam(value ="leftOverIssueQuantity",required = false) boolean leftOverIssueQuantity,
                                                @RequestParam(value ="theoriticalDollars",required = false) boolean theoriticalDollars,
                                                @RequestParam(value ="alowedTargetLeftOverDollars",required = false) boolean alowedTargetLeftOverDollars,
                                                @RequestParam(value ="actualDollars",required = false) boolean actualDollars,
                                                @RequestParam(value ="purchaseDollars",required = false) boolean purchaseDollars,
                                                @RequestParam(value ="transferDollars",required = false) boolean transferDollars,
                                                @RequestParam(value ="beginningInvoiceDollars",required = false) boolean beginningInvoiceDollars,
                                                @RequestParam(value ="endingInvoiceDollars",required = false) boolean endingInvoiceDollars,
                                                @RequestParam(value ="leftOverIssueDollars",required = false) boolean leftOverIssueDollars,
                                                @RequestParam(value ="loadId",required = false) boolean loadId){

        HashMap<String,Boolean> queryMap = new HashMap();
        queryMap.put("storeNumber",storeNumber);
        queryMap.put("id",id);
        queryMap.put("name",name);
        queryMap.put("descriptipon",descriptipon);
        queryMap.put("bussinessDate",bussinessDate);
        queryMap.put("itemId",itemId);
        queryMap.put("itemCode",itemCode);
        queryMap.put("itemDescription",itemDescription);
        queryMap.put("itemMajorCategoryId",itemMajorCategoryId);
        queryMap.put("itemMajorCategoryDescription",itemMajorCategoryDescription);
        queryMap.put("itemIdUserTypeDescription",itemIdUserTypeDescription);
        queryMap.put("itemcategoryDescription",itemcategoryDescription);
        queryMap.put("theoriticalQuantity",theoriticalQuantity);
        queryMap.put("allowedTargetLeftOverQuantity",allowedTargetLeftOverQuantity);
        queryMap.put("actualQuantity",actualQuantity);
        queryMap.put("allowedTargetLeftOverQuantity",allowedTargetLeftOverQuantity);
        queryMap.put("purchaseQuantity",purchaseQuantity	);
        queryMap.put("transferQuantity",transferQuantity);
        queryMap.put("beginningInvoiceCount",beginningInvoiceCount);
        queryMap.put("leftOverIssueQuantity",leftOverIssueQuantity);
        queryMap.put("theoriticalDollars",theoriticalDollars);
        queryMap.put("alowedTargetLeftOverDollars",alowedTargetLeftOverDollars);
        queryMap.put("actualDollars",actualDollars);
        queryMap.put("alowedTargetLeftOverDollars",alowedTargetLeftOverDollars);
        queryMap.put("purchaseDollars",purchaseDollars);
        queryMap.put("alowedTargetLeftOverDollars",alowedTargetLeftOverDollars);
        queryMap.put("transferDollars",transferDollars);
        queryMap.put("beginningInvoiceDollars",beginningInvoiceDollars);
        queryMap.put("endingInvoiceDollars",endingInvoiceDollars);
        queryMap.put("leftOverIssueDollars",leftOverIssueDollars);
        queryMap.put("loadId",loadId);


        return  foodReportService.saveReportCriteria(queryMap);
    }
}
