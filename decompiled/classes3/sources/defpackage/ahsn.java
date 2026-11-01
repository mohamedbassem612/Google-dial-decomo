package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahsn implements gei {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ gei b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ahsn(defpackage.ahso ahsoVar, gei geiVar, int i) {
        this.$cid = i;
        this.c = ahsoVar;
        this.a = "Click on delete all recordings button";
        this.b = geiVar;
    }

    public final boolean a(androidx.preference.Preference preference) {
        if (this.$cid == 0) {
            ahpm ahpmVarAO = ((defpackage.uzx) ((defpackage.ahso) this.c).a).aO("OnPreferenceClickListener", this.a);
            try {
                this.b.a(preference);
                ahpmVarAO.close();
                return true;
            } catch (java.lang.Throwable th) {
                try {
                    ahpmVarAO.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        gei geiVar = this.b;
        if (ahns.q()) {
            return geiVar.a(preference);
        }
        ahok ahokVarF = ((ahpz) this.c).f(1468, this.a);
        try {
            boolean zA = geiVar.a(preference);
            ahokVarF.close();
            return zA;
        } catch (java.lang.Throwable th3) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public /* synthetic */ ahsn(gei geiVar, ahpz ahpzVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = geiVar;
        this.c = ahpzVar;
        this.a = str;
    }
}
