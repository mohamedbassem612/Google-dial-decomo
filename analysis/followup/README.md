# متابعة تحليل تنبيه تسجيل المكالمات — Google Phone 244.0.1001930441

هذا فحص ثابت للـAPK الأصلي فقط. لم يُعدَّل أو يُعَد بناؤه أو يُشغَّل على جهاز. النتائج تصف مسارات موجودة في هذه النسخة؛ لا تثبت المسار أو المحرك أو الإعدادات المستخدمة على هاتف معين. لا توجد إعادة بناء تخمينية للكود.

## المصدر والأدوات

- الملف المحلي: `/workspace/google-phone-analysis-244/GooglePhone_244.0.1001930441_arm64.apk`، الحجم 84,773,759 بايت.
- SHA-256: `0ae5ba4f0f68ac200d1cf6e37b9685e57149b27ba9901d1879b133ddc4af53a0`، **مطابق تمامًا للقيمة المطلوبة**. بيانات الحزمة والإصدار في [دليل الحزمة السابق المطابق للبصمة](evidence/prior-rea/rea-package-evidence.json).
- قُرئ README المشروع. لم يوجد `AGENTS.md` في المستودع أو مسار الآباء الذي فُحص. أساس العمل commit `891c1a9f941e60e18a7f39836c6d110bd72f69f6`؛ الفرع الجديد `analysis/disclosure-followup`.
- REA `6.8.0`؛ حزمة `jadx-headless-mcp` إصدار `0.7.1`، source revision `5844800a486d2248fa949b74c9896285f5b54de2`. هذا إصدار حزمة المزود، وليس رقم إصدار JADX core.
- الاستعلام المباشر `jadx.core.Jadx.getVersion()` داخل JAR المستخدم بواسطة REA أعاد **`dev`**، ولذلك لا ننسب له رقم إصدار دلاليًا غير مثبت. [الخرج الأصلي](evidence/jadx-core-version.txt) و[برنامج الاستعلام](scripts/PhoneJadxVersion.java). التصدير السابق في المستودع استخدم JADX CLI `1.5.6`؛ لم يُعاد تصدير التطبيق في هذه المتابعة.
- إعدادات الاستدعاءات: heap ‏4096 MiB، عامل واحد، operation timeout ‏600000 ms؛ bridge default decompile timeout ‏90000 ms، resources=`full`، code cache ‏64، حد خرج source ‏1 MiB، وSmali fallback مفعّل. لا mapping file. JDK ‏21.0.12.1. [البصمات والإعدادات](evidence/provenance.json)، [جسر REA المستخدم](evidence/ReaJadxBridge.java)، [سكريبت الاستخراج](scripts/rea_extract.py).

## أجسام الدوال المطلوبة ومطابقة discriminator

فشل فك Java القابل للاستخدام للدوال الخمس، فأعاد REA **Smali كاملًا**، `body_status=available` و`source.status=complete`، دون قص. لم نحفظ بدائل Java مخترعة. احتُفظ بخرج REA الأصلي في `evidence/*.rea.json` وخرج CLI في `*.cli.json`، وبالنص نفسه في `smali/`.

| الدالة | الجسم الكامل | الفروع المطلوبة وعناوينها داخل DEX بوحدات 16-bit |
|---|---|---|
| `hnt.b(Object)` | [Smali](smali/hnt.b.smali)، [REA](evidence/hnt.b.rea.json) | 18 → `0x003b`، 19 → `0x001c` |
| `hqi.b(Object)` | [Smali](smali/hqi.b.smali)، [REA](evidence/hqi.b.rea.json) | 16 → `0x018f`، 17 → `0x0130`، 18 → `0x00d1` |
| `mwq.b(Object)` | [Smali](smali/mwq.b.smali)، [REA](evidence/mwq.b.rea.json) | 1 → `0x00ec` عبر `if-eq`، وليست switch |
| `ksy.b(Object)` | [Smali](smali/ksy.b.smali)، [REA](evidence/ksy.b.rea.json) | 2 → `0x0378`، 3 → `0x0358`، 4 → `0x031b`، 5 → `0x02de`، 6 → `0x029f`، 7 → `0x0260` |
| `kqd.b(Object)` | [Smali](smali/kqd.b.smali)، [REA](evidence/kqd.b.rea.json) | 2 → `0x06ef` |

جميعها في `classes2.dex`. التحقق قرأ حقل DEX الفعلي `$cid:I`، وفصلَه عن حقول حالة الـCoroutine، وفك switch payloads والمقارنات. [خريطة المطابقة](evidence/raw-dex/README.md)، [الفهارس والبصمات ومعالجات الاستثناء](evidence/raw-dex/manifest.json)، [تدقيق خرج REA](evidence/required-method-validation.json). لكل دالة dump لجميع التعليمات والـpayloads ومعالجات الاستثناءات، ونسخة hex مطابقة لبايتات `code_item` الأصلية. عناوين `:cu_…` تعليقات توضيحية على العناوين الأصلية، وليست Java مُعاد بناؤها. النص الأصلي من REA، بما فيه labels و`.catch` وswitch payloads، محفوظ دون تغيير.

معاني الفروع المثبتة: `hnt` ‏18 يهيئ TTS عبر `hyo.c`، و19 يأخذ locale من `izg.n()` ثم `hyo.a`. ‏`hqi` ‏16 يختار المزود القديم، و17 يولد **تنبيه النهاية** و18 **تنبيه البداية**؛ أسماء `a/b` وحدها لا تحدد البداية والنهاية. ‏`ksy` ‏2 يشغّل مسار النهاية الجديد عبر `hqi` ‏14، و3 البداية عبر `hqi` ‏15؛ ‏4/5 نهاية/بداية الصوت الجاهز، و6/7 بداية/نهاية الصفارة. الأدلة هي أجسام Smali أعلاه وموارد النصوص أدناه.

## 1. اختيار TTS أو الملف الجاهز أو الصفارة

يوجد مساران في `kxr.g(kxq)`، يُختار بينهما عبر المزود المنطقي `kxr.w` الذي يُقرأ وقت التشغيل: المسار القديم يستخدم `gou` و`hqi` ‏16 ومزود `kuo`؛ والجديد يستخدم `klt` و`ksy` ‏2/3 وAudioInjector. لا نثبت قيمة هذا المزود على جهاز. [الدالة](java/kxr.g.java)، [REA](evidence/prior-rea/rea-kxr-g.json).

في المسارين يُحترم نوع التنبيه المفضّل إذا كان موجودًا في خريطة الأنواع المتاحة. إذا لم يكن متاحًا، يُختار أعلى رقم enum من المتاح: `TTS=3` ثم `BUILT_IN=2` ثم `BEEP_SOUND=1`. هذا بديل عند **اختيار النوع**، ولا يثبت إعادة المحاولة بنوع آخر بعد فشل التوليد أو التشغيل. الخريطة الفارغة تؤدي إلى خطأ بدل نوع افتراضي مضمون. [klt.b](java/klt.b.java)، [hqi.b فرع16](smali/hqi.b.smali)، [kun](evidence/existing-export/kun.java).

إنشاء الخريطتين في `hil.a()` فرعي 1210 و1218 يستخدم شروط دعم: الجاهز عندما `kwt.a()` يعيد locale؛ وTTS عندما لا يعيد locale للصوت الجاهز؛ والصفارة عبر `kuw.a()`. شرط الصفارة يتضمن override للإتاحة، أو تحقق بلد التسجيل ووجود البلد في قائمة بلدان الصفارة. هذه قيم تهيئة وإتاحة وليست إعدادات افترضنا توفرها للجميع. [hil](evidence/existing-export/hil.java)، [kpr.a](java/kpr.a.java)، [kuw.a تعليمات DEX](evidence/raw-dex-extra/kuw.a.disasm.txt)، [kwt](evidence/existing-export/kwt.java). يوجد في Java الناتجة لـ`kuw`، سواء التصدير السابق أو REA، تشويه لتدفق شرط true؛ المرجع هنا تعليمات DEX عند `0x008d` و`0x00a4`، وليس السطر المعيب من Java.

## 2. متى تُختار الموارد العربية؟

في المسار القديم للصوت الجاهز، `kup.c(prefix)` → `kqd.b` فرع2 يحصل على `kwt.a()`، ويضم `starting_voice-` أو `ending_voice-` إلى `Locale.toString()`، ويستبدل `-` بـ`_`، ثم يبحث في خريطة `kup.a`. عندما يعيد المزود `ar_XA`، ينتج المفتاحان `starting_voice_ar_XA` و`ending_voice_ar_XA`. locale مفقود أو مفتاح غير موجود يؤدي إلى exception. [kqd.b عند `:pswitch_6ef`](smali/kqd.b.smali)، [kup](evidence/existing-export/kup.java)، [ksy.b فرعا4/5](smali/ksy.b.smali).

في المسار الجديد، `jsp.a()` فرع20 يقارن locale صراحةً بـ`Locale.forLanguageTag("ar-XA")` ويستخدم الموردين العربيين؛ يدعم كذلك `my-MM` ويرفض locale آخر. [jsp](evidence/existing-export/jsp.java)، [خريطة موارد APK](resources/resources-resolved.json).

اختيار locale للجاهز يأتي من **خريطة country → language tag** يحصل عليها `kwt`، وليس مجرد كون لغة الواجهة عربية. `hlv` ‏7 يجلب البلد الفيزيائي عبر `rlt.b`، و12 يبني خريطة البلاد من بيانات التهيئة؛ `kwt.g` يتحقق من الوسم واللغة. بلد الشبكة GSM ثم SIM يدخلان في كاشف البلد؛ شروط إتاحة التسجيل تتضمن أيضًا مطابقة الشبكة وSIM في `kwt.c`. لم نحصل على قيم التهيئة الفعلية لهاتف، فلا نحدد قائمة بلدان تستخدم `ar-XA`. [kwt](evidence/existing-export/kwt.java)، [hlv](evidence/existing-export/hlv.java)، [rlt](evidence/existing-export/rlt.java).

## 3. المحرك العادي ومحرك prewarm

المسار العادي `hnt` ‏18 → `hyo.c` يستخدم منشئ `TextToSpeech(Context, OnInitListener)` ذي المعاملين، دون اسم حزمة محرك. ومسار prewarm في `gzk.call()` فرع17 يستخدم المنشئ نفسه. وفق دلالة Android API، هذا يترك اختيار المحرك الافتراضي للنظام؛ لا يفرض محرك Google. المحرك الفعلي على الهاتف يحتاج ملاحظة وقت التشغيل. [hyo.c](java/hyo.c.java)، [gzk.call](java/gzk.call.java).

التهيئة العادية تفحص نجاح `onInit`، وتتحقق من `isLanguageAvailable(locale) >= 0` وتطلب `setLanguage`. مهلة إنشاء المثيل 10 ثوانٍ. `kus.c` يعيد مثيله المحفوظ إن وُجد، ثم يحاول مثيل prewarm، وإلا يستخدم `hnt` ‏19 وlocale من `izg.n()`؛ لا يظهر إبطال بسبب تبديل المحرك في هذه الدالة نفسها. [hyo.a](java/hyo.a.java)، [تعليماتها الأصلية عند الحاجة بسبب تحذير Java](evidence/raw-dex-extra/hyo.a.disasm.txt)، [hyn](evidence/existing-export/hyn.java)، [kus.c](java/kus.c.java)، [izg](evidence/existing-export/izg.java).

prewarm لا يبدأ إلا إذا سمح شرطه، ويُتخطى عند توفر locale للصوت الجاهز. `jyr.call()` فرع13 يطلب اللغة، ثم ينفذ synthesis تجريبيًا للنص الفارغ في ملف مؤقت، بمعرّف `dummytext` وBundle `com.google.android.tts:Mode=LocalOnly`. **المعامل الخاص بـGoogle لا يختار حزمة المحرك**. قيمة الإرجاع الصحيحة لهذا الطلب التجريبي لا تُفحص في هذا الفرع. [ddv.run فرع11](evidence/existing-export/ddv.java)، [lbq](evidence/existing-export/lbq.java)، [jyr.call](java/jyr.call.java).

## 4. توليد الملف وفحص النتيجة

التوليد الحقيقي موجود في `blv.b` فرع6: يقرأ النص من resource بالـlocale المطلوب، ويثبّت `UtteranceProgressListener`، ثم ينفذ `synthesizeToFile(text, new Bundle(), file, "ttsFileProvider-" + fileName)`. تُفحص قيمة الإرجاع: **0** يسمح بانتظار callback؛ غير ذلك يسجل خطأ ويطلق `IllegalStateException("tts invocation failed.")`. [Smali كامل](smali/blv.b.smali)، [REA](evidence/blv.b.rea.json)، [DEX الأصلي عند `0x055b–0x0595`](evidence/raw-dex-extra/blv.b.disasm.txt).

`hyr.onDone` يكمل انتظار التوليد؛ ونسختا `onError` تكملانه بخطأ. بعد callback، يفحص `mwq.b` ‏1 أن طول الملف غير صفر: الملف الصفري يُحذف ويُطلق خطأ. هناك مهلة توليد 5 ثوانٍ في `hys`/`mwq`، ويعاد رمي خطأ المهلة. اكتمال طلب `synthesizeToFile` الفوري وحده لا يثبت اكتمال الملف. [onDone](java/hyr.onDone.java)، [onError ذو معامل واحد](java/hyr.onError.o0.java)، [ذو معاملين](java/hyr.onError.o1.java)، [mwq.b](smali/mwq.b.smali)، [hys](evidence/existing-export/hys.java).

## 5. إعادة استخدام الملفات وتجديدها

- **الجاهز والصفارة:** `kuu.a` → `kdr.b` فرع3 ينشئ مسار `files/callrecordingprompt/<kut.h>`. إذا `File.exists()` صحيح يرجع الملف الموجود؛ وإلا ينشئ المجلد وينسخ raw resource. لا يظهر هنا فحص طول أو mtime أو إصدار الملف الموجود أو تجديده لمجرد تحديث التطبيق. تبدل المورد/الاسم يختار ملفًا آخر. [kdr.b عند `0x03a7–0x0420` والرجوع `0x05b8`](smali/kdr.b.smali)، [kuu](evidence/existing-export/kuu.java)، [كتالوج raw resources](resources/resources-resolved.json).
- **TTS:** الاسم تحت `files/audioinjector/` بالشكل `<resourceEntryName>_<locale>.wav`. في السلسلة `hys.b` → `mwq` ‏1 → `blv` ‏6 لا يوجد شرط `exists` لتجاوز synthesis؛ الطلب يولّد عند كل مرور في هذه السلسلة إلى المسار المحسوب، ثم يفحص الطول. تغير locale يغير الاسم. **إعادة استخدام مثيل TTS لا تعني إعادة استخدام الملف دون توليد**. لا نعمم هذا على كل مزود صوت في التطبيق. [hys.a](java/hys.a.java)، [mwq](smali/mwq.b.smali)، [blv](smali/blv.b.smali).

## 6. الفشل وما الذي يسمح ببدء التسجيل؟

في `hqi` ‏17/18 و`ksy` ‏4–7: فشل تجهيز ملف التنبيه يُسجّل ثم يعاد رميه. وفي مسار AudioInjector `hqi` ‏14/15 يُسجل فشل النوع المختار ثم يُرمى الخطأ؛ لم نجد في هذه السلسلة إعادة محاولة تلقائية من TTS إلى صفارة أو إلى صوت جاهز. هذا مستقل عن اختيار نوع بديل عندما يكون التفضيل غير متاح.

المسار اليدوي: `kxx.g` يطلب صوت البداية عبر `kxr.b`، ثم `ibe` ‏7 ينتظر `hxf.b()`؛ `kxt.b` فرع3 يستدعي `kxr.c` **فقط عند `hxe.a = COMPLETED`**. حالات CANCELED/FAILED/MUTED لا تبدأ التسجيل في هذا الفرع؛ والاستثناء يصل إلى `kxt.a` ‏3 الذي يسجّل فشل الصوت ويحدّث حالة الخطأ. إذن الحدث الحاسم هنا هو **اكتمال التشغيل بنجاح، وليس اكتمال توليد الملف**. [kxx.g](java/kxx.g.java)، [kxt.b](java/kxt.b.java)، [kxt.a](java/kxt.a.java)، [ibe](evidence/existing-export/ibe.java)، [hxg](evidence/existing-export/hxg.java)، [blj.b فرع9 وتجميع انتهاء playback](evidence/raw-dex-extra/blj.b.disasm.txt)، [hxe](evidence/existing-export/hxe.java).

في المسار التلقائي الذي ظهر في `kxm.a`: الفرع9 يحول اكتمال disclosure إلى true، وباقي أسباب الانتهاء إلى false؛ والفرع10 يبدأ التسجيل عند true فقط. لا يُفهم عدم بدء التسجيل عند فشل تنبيه البداية على أنه إنهاء المكالمة، ولا يثبت هذا الفحص ماذا يحدث على كل مسار لإنهاء تسجيل بدأ بالفعل. [kxm.a](java/kxm.a.java).

## 7. الإعداد الفعلي ومكان قراءته

يوجد toggle بواجهة الإعدادات، مفتاحه resource `use_beep_sound_toggle_key` ‏(`0x7f140dbb` = `2132020667`)، وعنوانه الافتراضي `Play audio tone instead of disclaimer`. `kzk.aU` يُظهره فقط عندما تحتوي قائمة الأنواع المتاحة على **نوعين بالضبط وأحدهما BEEP_SOUND**. ليس مفتاحًا يَعِد بتعطيل كل الأصوات. [resource](resources/strings-default-focused.xml)، [kzk.aU](evidence/existing-export/kzk.java).

عند التفعيل، `mmo.a` فرع1 يعرض حوار شروط الصفارة؛ وعند الإلغاء يطلب حفظ النوع الموجود في أول القائمة المرتبة (`get(0)`)؛ لا نفترض ترتيبها من اسم المفتاح وحده. الاختيار المخزن يُقرأ عبر `aogc.aX()` → `aW()` → `jvq.apply` ‏20، الذي يحول الحقل `kwy.i` إلى enum `kun`. الكاتب `kvy.c` → `aogc.ba` → `jss.apply` ‏18 يحدّث الحقل. **مفتاح عنصر الواجهة ليس دليلًا على SharedPreferences قابلة للكتابة من خارج التطبيق**؛ لم نستنتج طريقة تعديل خارجية. [mmo](evidence/existing-export/mmo.java)، [aogc](evidence/existing-export/aogc.java)، [jvq](evidence/existing-export/jvq.java)، [kvy](evidence/existing-export/kvy.java)، [jss](evidence/existing-export/jss.java).

## الموارد وحدود الدليل

[جدول الموارد](resources/resources-resolved.json) يربط الموردين العربيين بـ`res/zq.m4a` للبداية و`res/fD.m4a` للنهاية، ويحفظ البصمات والنسخ الصوتية المحدودة في `resources/audio/`. نص TTS العربي للبداية: «يجري الآن تسجيل هذه المكالمة.»، وللنهاية: «لقد انتهى تسجيل المكالمة الآن.» هذه **نصوص resource وليست تفريغًا سمعيًا لملفات m4a**. [تفاصيل الاستخراج](resources/README.md).

الأجسام الخمسة المطلوبة لم تتعذر كتعليمات؛ التعذر هو **فكها إلى Java سليمة**. كذلك استُخدم Smali لـ`blv.b` و`kdr.b`. بعض أجسام Java الناجحة تحتوي تحذيرات JADX حول الـCoroutine/الأنواع، وبالأخص `hyo.a`؛ حُفظ خرج الأداة دون إصلاح يدوي، وتوجد تعليمات DEX إضافية للرجوع إليها. [فهرس الاستخراج](evidence/extraction-index.json) يسجل الحالة والتمثيل والبصمات لكل جسم. الاستدعاء الأول غير المحدد لـ`hyr.onError` رفضه REA بسبب وجود overloads؛ حُفظ الرفض، ثم استُخرج كلا التوقيعين صراحةً بنجاح.

لم تُحسم على جهاز: قيمة feature flags وخرائط البلدان، اختيار المحرك الفعلي، صلاحية ملفات موجودة بالفعل في بيانات التطبيق، نجاح callback والمهل والتوجيه الصوتي، أو ظهور الإعداد على هاتف المستخدم. لم يُختبَر تشغيل الصوت أو سماعه عن بُعد أو سلوك الفشل عمليًا. إصدار JADX core الدلالي غير معلن من JAR (`dev`)؛ البصمة الدقيقة محفوظة. نسخ التصدير السابق في `evidence/existing-export/` مميزة بmanifest يذكر commit المصدر وبصمات الملفات، ولا تُقدَّم على أنها خرج REA جديد. لم يُصدّر التطبيق كله مجددًا، ولم يُضف APK أو DEX كامل.
