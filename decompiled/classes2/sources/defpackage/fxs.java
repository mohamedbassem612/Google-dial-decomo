package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxs implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fxs(int i) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state IN (0, 1) AND schedule_requested_at<>-1";
    }

    /* JADX WARN: Type inference failed for: r7v34, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z = true;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "key");
                return java.lang.Boolean.valueOf(!((defpackage.fvz) this.a).c().contains(str));
            case 1:
                defpackage.fwc fwcVar = (defpackage.fwc) obj;
                aooh.f(fwcVar, "destination");
                return java.lang.Boolean.valueOf(!((defpackage.fxr) this.a).h.containsKey(java.lang.Integer.valueOf(fwcVar.b())));
            case 2:
                java.lang.String str2 = (java.lang.String) obj;
                aooh.f(str2, "key");
                return java.lang.Boolean.valueOf(!gie.f((android.os.Bundle) this.a, str2));
            case 3:
                java.lang.String str3 = (java.lang.String) obj;
                aooh.f(str3, "key");
                return java.lang.Boolean.valueOf(!((defpackage.fvz) this.a).c().contains(str3));
            case 4:
                fzd fzdVar = (fzd) obj;
                aooh.f(fzdVar, "loadState");
                defpackage.fyr fyrVar = (defpackage.fyr) this.a;
                if (((java.lang.Boolean) fyrVar.m.c()).booleanValue()) {
                    android.os.Handler handler = (android.os.Handler) fyrVar.l.a();
                    xwr xwrVar = fyrVar.n;
                    handler.removeCallbacks(xwrVar);
                    ((java.util.concurrent.atomic.AtomicReference) xwrVar.a).set(fzdVar);
                    handler.post(xwrVar);
                } else {
                    java.util.Iterator it = fyrVar.j.iterator();
                    while (it.hasNext()) {
                        ((aonj) it.next()).a(fzdVar);
                    }
                }
                return aojh.a;
            case 5:
                gdo gdoVar = (gdo) obj;
                aooh.f(gdoVar, "stash");
                for (int i : gdoVar.a) {
                    if (((aopq) this.a).e(i)) {
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 6:
                gip gipVar = (gip) obj;
                aooh.f(gipVar, "db");
                ((maw) this.a).d = gipVar;
                return aojh.a;
            case 7:
                aooh.f((gjh) obj, "it");
                return this.a.a();
            case 8:
                gip gipVar2 = (gip) obj;
                aooh.f(gipVar2, "db");
                gipVar2.j((java.lang.String) this.a);
                return aojh.a;
            case 9:
                gip gipVar3 = (gip) obj;
                aooh.f(gipVar3, "db");
                gipVar3.p((java.lang.Object[]) this.a);
                return aojh.a;
            case 10:
                android.content.Intent intent = (android.content.Intent) obj;
                aooh.f(intent, "intent");
                ?? r7 = this.a;
                if ((r7 instanceof java.util.Collection) && r7.isEmpty()) {
                    z = false;
                } else {
                    java.util.Iterator it2 = r7.iterator();
                    while (it2.hasNext()) {
                        if (((gnl) it2.next()).b(intent)) {
                        }
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 11:
                android.app.Activity activity = (android.app.Activity) obj;
                aooh.f(activity, "activity");
                ?? r8 = this.a;
                if ((r8 instanceof java.util.Collection) && r8.isEmpty()) {
                    z = false;
                } else {
                    java.util.Iterator it3 = r8.iterator();
                    while (it3.hasNext()) {
                        if (((gnl) it3.next()).a(activity)) {
                        }
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 12:
                return ils.h((java.lang.String) this.a, (gjh) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                gjh gjhVar = (gjh) obj;
                aooh.f(gjhVar, "_connection");
                gin ginVarA = gjhVar.a((java.lang.String) this.a);
                try {
                    return java.lang.Integer.valueOf(ginVarA.m() ? (int) ginVarA.c(0) : 0);
                } finally {
                    ginVarA.close();
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Boolean.valueOf(((defpackage.hcb) this.a).o(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, ((java.lang.Long) obj).longValue()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                czb czbVar = (czb) obj;
                aooh.f(czbVar, "$this$layout");
                czbVar.u((czc) this.a, 0, 0, 0.0f);
                return aojh.a;
            case 16:
                aooh.f((defpackage.hgo) obj, "it");
                return this.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream((android.os.ParcelFileDescriptor) this.a);
                try {
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, autoCloseOutputStream);
                    autoCloseOutputStream.flush();
                    ajsz.ak(autoCloseOutputStream, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(autoCloseOutputStream, th);
                        throw th2;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) obj;
                java.lang.CharSequence description = disconnectCause.getDescription();
                return (description == null || description.length() == 0) ? ((android.content.Context) this.a).getString(2132018226) : disconnectCause.getDescription().toString();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                aooh.f(phoneAccountHandle, "accountHandle");
                java.lang.Object obj2 = this.a;
                ahok ahokVarF = ((defpackage.hqa) obj2).a.f(68, "CarPhoneAccountSelectionListener.onAccountSelected");
                try {
                    ((defpackage.hqa) obj2).b.p(phoneAccountHandle);
                    ((defpackage.hqa) obj2).c.i((java.lang.String) null).b(mce.gE);
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahokVarF, th3);
                        throw th4;
                    }
                }
            default:
                ((defpackage.hzx) this.a).b.run();
                return aojh.a;
        }
    }

    public /* synthetic */ fxs(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ fxs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
