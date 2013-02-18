function checkprice() {
            var myAjax = new Ajax.PeriodicalUpdater('price', 'http://www.scott-davidson.com/reunion2013/php/stock.php',
            	 {method: 'get', frequency: 3.0, decay: 1});
}
        
window.onload = checkprice;
