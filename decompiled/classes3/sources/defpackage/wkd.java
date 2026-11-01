package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wkd {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelRepository");
    public final android.content.Context b;
    public final ajct c;
    public final aoin d;
    public final ipc e;
    public final aogc f;
    private final ajct g;
    private final aoin h;
    private final rsr i;

    public wkd(android.content.Context context, ajct ajctVar, ajct ajctVar2, aoin aoinVar, aoin aoinVar2, rsr rsrVar, aogc aogcVar, ipc ipcVar) {
        this.b = context;
        this.c = ajctVar;
        this.g = ajctVar2;
        this.h = aoinVar;
        this.i = rsrVar;
        this.f = aogcVar;
        this.d = aoinVar2;
        this.e = ipcVar;
        new agtc(new defpackage.viv(this, 4), ajctVar2);
    }

    public final ajcq a() {
        defpackage.acvm acvmVarA = defpackage.acvn.a();
        acvmVarA.b(((acux) this.h.a()).c);
        return ahvr.H(this.i.G(acvmVarA.a()), new defpackage.wie(this, 8), this.c);
    }

    public final ajcq b() {
        return ahvr.H(a(), new defpackage.wkb(2), this.g);
    }
}
