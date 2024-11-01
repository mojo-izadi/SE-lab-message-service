به نام خدا

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

## اهداف
در این آزمایش هدف بر آن است که دانشجویان با به کارگیری اصول SOLID در یک پروژه‌ی عملی ساده آشنا شوند.

## نیازمندی‌ها
آشنایی اولیه با مفاهیم برنامه نویسی و طراحی شی‌گرا که دانشجویان قبلاً در درس برنامه‌سازی پیشرفته با آن آشنا شده‌اند.

## ابزارهای مورد استفاده
- یک Java IDE مانند IntelliJ IDEA و یا Eclipse به همراه jdk حداقل نسخه ۸

## منابع آموزشی
برای آشنایی با این اصول و آشنایی با منابع مناسب به [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/blob/main/educational-resources/SOLID/README.md) مراجعه کنید.

## مقدمه
در این آزمایش شما خواهید آموخت که چگونه می‌توانید با به کارگیری اصول SOLID، نرم‌افزارهایی را بسازید که از نظر قابلیت نگهداری و بهبود، در وضعیت مطلوبی باشند و مدیریت تغییرات در آن‌ها به آسانی میسر باشد (شک نکنید که به کارگیری این اصول اساسی و بسیاری دیگر از اصول مهندسی نرم افزار، باعث تفاوت شما با سایر همکارانتان خواهد شد)

## بخش اول: توضیحاتی پیرامون برنامه‌ی داده شده
می‌توانید برنامه را از [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/tree/main/base-projects/SOLID-Principles) بارگیری کنید.

### مفروضات مسئله
صورت آزمایش در درس افزار بارگزاری شده است و می‌توانید برای تحویل گزارش (با در نظر گرفتن ملاحظات گفته شده) از قالب های زیر استفاده کنید.

## بخش دوم: دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>Telegram Message</p>
</td>
<td width="141">
<p>ایجاد یک کلاس با نام ذکر شده</p>
</td>
<td width="292">
<p>افزودن یک کلاس برای پیام تلگرام جهت نگهداری آیدی مبدا و مقصد</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>Telegram Message Service</p>
</td>
<td width="141">
<p>ایجاد یک کلاس با نام ذکر شده</p>
</td>
<td width="292">
<p>ایجاد کلاس سرویس پیام تلگرام برای اعتبارسنجی آیدی مبدا و مقصد</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>SMS Message Service</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>این تابع در واسط مربوط به message service تعریف شده است و به دلیل ارث بری این کلاس در اینجا نیز افزوده شد</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>Email Message Service</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>این تابع در واسط مربوط به message service تعریف شده است و به دلیل ارث بری این کلاس در اینجا نیز افزوده شد</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن قابلیت ارسال یک پیام تلگرامی در کد</p>
</td>
<td width="292">
<p>با دادن شماره کد 3 به کاربر این امکان برایش فراهم است که یک پیام تلگرامی ارسال کند.</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 6

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>به این دلیل نقض شده است که با اضافه کردن فیچر جدید کلاس های زیادی از جمله سرویس های sms و email دچار تغییر شدند و همچنین اینترفیس مربوط به message service که کارش باید مستقل از نوع سرویس باشد، دچار تغییر شدند و این با این اصل که در صورت اضافه شدن فیچر جدید، حداقل تغییرات در کد قبلی و صرفا اضافه شدن کلاس بود، در تناقض است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>به این دلیل نقض شده است که بیان می دارد بهتر است به جای یک اینترفیس بزرگ، چند اینترفیس کوچک داشته باشیم تا هنگامی که کلاس هایی از آن ارث بری می کنند، بدنه توابعی که باید پیاده سازی کنند حالی نباشد. در اینجا به وضوح اینترفیس message service یک اینترفیس بزرگ است و این باعث شد تا کلاس هایی که از آن ارث بری می کنند فقط توابع مربوط به خودشان را پیاده سازی کنند و بدنه بقیه توابع خالی بماند که با این اصل در تناقض است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟

## نحوه ارسال پروژه:
1.	گام ۱ را انجام داده و سپس کد نوشته شده‌ی خود را (با رعایت محدودیت‌های گفته شده در گام) در یک پوشه به نام Step_1_Non_SOLID ذخیره کنید و در مخزن گام ۲ قرار دهید. موارد توضیحی بایستی در بخش README مخزن قرار گیرد.
2.	گام ۲ (که بخش تحلیلی است) در فایل README مربوط به مخزن گام ۲ آورده شود (تمام جداول با فرمت داده شده و عناوین هرکدام از سوالات پرسیده شده بایستی در README آورده شود).
3.	گام ۳ که شامل بهبود است، بایستی به صورت جداگانه در پوشه دیگری به نام Step_3_With_SOLID قرار داده شود و در مخزن موجود باشد.
4.	گام ۴ نیز در قالب توضیحات در README مخزن آورده شود.
5.	گام ۵ (که نتیجه گیری است) در README مخزن آورده شود.
