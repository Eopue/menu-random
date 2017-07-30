/*
 * moment-fix.js
 *
 * Assign reference to moment at global scope to let ChartJS use window.moment.
 */

define(['moment'], function (moment) {
    // assign moment to global window object
    window.moment = moment;
});