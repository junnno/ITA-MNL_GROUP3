/*
 * File: app/store/chartGridStore.js
 *
 * This file was generated by Sencha Architect version 4.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 6.5.x Classic library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 6.5.x Classic. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.store.chartGridStore', {
    extend: 'Ext.data.Store',

    requires: [
        'MyApp.model.ChartModel'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            storeId: 'chartGridStore',
            model: 'MyApp.model.ChartModel',
            data: [
                {
                    month: 'January',
                    netValue: 897.84
                },
                {
                    month: 'February',
                    netValue: 903.64
                },
                {
                    month: 'March',
                    netValue: 677.78
                },
                {
                    month: 'April',
                    netValue: 681.73
                },
                {
                    month: 'May',
                    netValue: 905.21
                },
                {
                    month: 'June',
                    netValue: 811.48
                },
                {
                    month: 'July',
                    netValue: 995.11
                },
                {
                    month: 'August',
                    netValue: 384.89
                },
                {
                    month: 'September',
                    netValue: 982.48
                },
                {
                    month: 'October',
                    netValue: 594.52
                },
                {
                    month: 'November',
                    netValue: 185.85
                },
                {
                    month: 'December',
                    netValue: 66.44
                }
            ]
        }, cfg)]);
    }
});