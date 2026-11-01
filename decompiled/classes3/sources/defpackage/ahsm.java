package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahsm implements geh {
    public final /* synthetic */ defpackage.ahso a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ geh c;

    public /* synthetic */ ahsm(defpackage.ahso ahsoVar, java.lang.String str, geh gehVar) {
        this.a = ahsoVar;
        this.b = str;
        this.c = gehVar;
    }

    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        ahpm ahpmVarAO = ((defpackage.uzx) this.a.a).aO("OnPreferenceChangeListener", this.b);
        try {
            boolean zA = this.c.a(preference, obj);
            ahpmVarAO.close();
            return zA;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarAO.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
