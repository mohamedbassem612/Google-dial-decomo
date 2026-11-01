package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwk implements defpackage.adve {
    private final defpackage.advx a;

    static {
        aiof.i("GnpSdk");
    }

    public adwk(defpackage.advx advxVar) {
        this.a = advxVar;
    }

    @Override // defpackage.adve
    public final boolean a(android.content.Intent intent) {
        if (!aooh.n("com.google.android.c2dm.intent.RECEIVE", intent.getAction())) {
            return false;
        }
        intent.getAction();
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            java.util.Iterator<java.lang.String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                java.util.Objects.toString(extras.get(it.next()));
            }
        }
        defpackage.advu advuVarA = defpackage.advu.a(intent);
        int i = advuVarA.f;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1) {
            return this.a.a(advuVarA);
        }
        return i2 == 2;
    }
}
