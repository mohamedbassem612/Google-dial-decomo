package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jvt implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callertags/impl/CallerTagsFeatureEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.aoin c;

    public jvt(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        defpackage.aoin aoinVar = this.b;
        if (((java.lang.Long) aoinVar.a()).longValue() != 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callertags/impl/CallerTagsFeatureEnabledFn", "isEnabled", 32, "CallerTagsFeatureEnabledFn.java")).y("caller tag experiment id: %s", aoinVar.a());
            return true;
        }
        defpackage.aoin aoinVar2 = this.c;
        long jLongValue = ((java.lang.Long) aoinVar2.a()).longValue();
        defpackage.aimz aimzVar = a;
        if (jLongValue != 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callertags/impl/CallerTagsFeatureEnabledFn", "isEnabled", 38, "CallerTagsFeatureEnabledFn.java")).y("caller tag crowdsourcing experiment id: %s", aoinVar2.a());
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callertags/impl/CallerTagsFeatureEnabledFn", "isEnabled", '+', "CallerTagsFeatureEnabledFn.java")).v("caller tags disabled by flags.");
        return false;
    }
}
