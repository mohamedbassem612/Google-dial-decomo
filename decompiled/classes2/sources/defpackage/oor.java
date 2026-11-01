package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oor implements akcr {
    private static final java.util.List a = ajsz.bb(new java.lang.String[]{"com.android.contacts", "com.android.dialer", "com.android.incallui", "com.android.voicemail", "com.google.android.callcoreshared", "com.google.android.callingshared", "com.google.android.dialershared", "com.google.android.libraries.concurrent.monitoring", "com.google.apps.tiktok.concurrent", "com.google.quality.views.extraction.kcube.bg.ondevice.modules.callassistant"});
    private final aoin b;
    private final aoin c;
    private final int d = 5;

    public oor(int i, aoin aoinVar, aoin aoinVar2) {
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    public final boolean a() {
        java.lang.Object objA = this.c.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    public final boolean b(java.util.logging.Level level) {
        aooh.f(level, "lvl");
        return level.intValue() >= java.util.logging.Level.WARNING.intValue();
    }

    public final boolean c(aiom aiomVar) {
        java.lang.String strB;
        if (aooh.n(aiomVar.n().d(zct.b), java.lang.Boolean.TRUE) || (strB = aiomVar.f().b()) == null) {
            return false;
        }
        if (!aoov.ad(strB, "com.google.android.dialershared.coroutines")) {
            if (((alfc) this.b.a()).b.contains(strB) || aoov.ad(strB, "com.google.android.libraries.abuse.hades")) {
                return false;
            }
            java.util.List list = a;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (aoov.ad(strB, (java.lang.String) it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int e() {
        return 4;
    }

    public final /* synthetic */ void d() {
    }
}
