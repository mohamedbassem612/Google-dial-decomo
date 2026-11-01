package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adit implements adhy {
    public final java.util.Map a;
    public aify b = com.google.android.libraries.micore.superpacks.common.PackManifest.j;
    public byte[] c;
    public boolean d;

    public adit(java.util.Map map) {
        this.a = map;
    }

    public final /* bridge */ /* synthetic */ adhy a() {
        adik.i(this.d);
        return new defpackage.adit(adiu.c(this.a));
    }

    public final void close() {
        if (!this.d) {
            java.util.Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                ((defpackage.adir) ((java.util.Map.Entry) it.next()).getValue()).close();
            }
        }
        this.d = true;
    }
}
