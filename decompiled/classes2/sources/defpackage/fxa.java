package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxa extends defpackage.fwd {
    private final defpackage.fwz c;
    private final aonp d;

    public fxa(defpackage.fwz fwzVar, java.lang.String str, aonp aonpVar) {
        super(fwzVar, str);
        this.c = fwzVar;
        this.d = aonpVar;
    }

    @Override // defpackage.fwd
    public final /* bridge */ /* synthetic */ defpackage.fwc a() {
        return (defpackage.fwy) super.a();
    }

    @Override // defpackage.fwd
    public final /* bridge */ /* synthetic */ defpackage.fwc b() {
        return new defpackage.fwy(this.c, this.d);
    }
}
