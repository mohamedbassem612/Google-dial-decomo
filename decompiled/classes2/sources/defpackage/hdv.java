package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdv implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdl b;
    public final defpackage.hdl c;
    public final defpackage.hdb d;
    public final boolean e;

    public hdv(java.lang.String str, defpackage.hdl hdlVar, defpackage.hdl hdlVar2, defpackage.hdb hdbVar, boolean z) {
        this.a = str;
        this.b = hdlVar;
        this.c = hdlVar2;
        this.d = hdbVar;
        this.e = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.has(gzsVar, hefVar, this);
    }

    public final java.lang.String toString() {
        defpackage.hdl hdlVar = this.c;
        return "RectangleShape{position=" + java.lang.String.valueOf(this.b) + ", size=" + java.lang.String.valueOf(hdlVar) + '}';
    }
}
