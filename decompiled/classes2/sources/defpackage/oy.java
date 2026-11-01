package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oy extends or {
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ox] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, ox] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ox] */
    public final /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        defpackage.tw twVar = (defpackage.tw) obj;
        aooh.f(context, "context");
        aooh.f(twVar, "input");
        if (defpackage.kj.p()) {
            android.content.Intent intent = new android.content.Intent("android.provider.action.PICK_IMAGES");
            intent.setType(defpackage.kj.o(twVar.a));
            java.lang.Object obj2 = twVar.b;
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        aooh.f(context, "context");
        if (defpackage.kj.n(context) == null) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(defpackage.kj.o(twVar.a));
            if (intent2.getType() != null) {
                return intent2;
            }
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
            return intent2;
        }
        android.content.pm.ResolveInfo resolveInfoN = defpackage.kj.n(context);
        if (resolveInfoN == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.content.pm.ActivityInfo activityInfo = resolveInfoN.activityInfo;
        android.content.Intent intent3 = new android.content.Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(defpackage.kj.o(twVar.a));
        java.lang.Object obj3 = twVar.b;
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    public final /* bridge */ /* synthetic */ defpackage.oq getSynchronousResult(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        aooh.f((defpackage.tw) obj, "input");
        return null;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        aokc arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        android.net.Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        android.net.Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        android.content.ClipData clipData = intent.getClipData();
        if (clipData == null) {
            if (linkedHashSet.isEmpty()) {
                arrayList = aokc.a;
            }
            return (android.net.Uri) ajsz.bG(arrayList);
        }
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            android.net.Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null) {
                linkedHashSet.add(uri);
            }
        }
        arrayList = new java.util.ArrayList(linkedHashSet);
        return (android.net.Uri) ajsz.bG(arrayList);
    }
}
