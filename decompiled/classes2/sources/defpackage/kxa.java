package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kxa implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ kxa(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vcx */
    public final java.lang.Object apply(java.lang.Object obj) throws vcx {
        int i = this.$cid;
        boolean z = true;
        if (i == 0) {
            akzx akzxVarP = ((kwy) obj).p();
            akzxVarP.u();
            kwy kwyVar = akzxVarP.b;
            kwyVar.b |= 1;
            boolean z2 = this.a;
            kwyVar.c = z2;
            if (z2) {
                akzxVarP.u();
                kwy kwyVar2 = akzxVarP.b;
                kwyVar2.b |= 4;
                kwyVar2.e = true;
            }
            return akzxVarP.p();
        }
        if (i == 1) {
            akzx akzxVarP2 = ((kwy) obj).p();
            akzxVarP2.u();
            kwy kwyVar3 = akzxVarP2.b;
            kwyVar3.b |= 16;
            boolean z3 = this.a;
            kwyVar3.g = z3;
            if (z3) {
                akzxVarP2.u();
                kwy kwyVar4 = akzxVarP2.b;
                kwyVar4.b |= 4;
                kwyVar4.e = true;
            }
            return akzxVarP2.p();
        }
        if (i == 2) {
            tcp tcpVar = (tcp) obj;
            if (this.a && tcpVar.equals(tcp.d)) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i == 3) {
            return (((java.lang.Boolean) obj).booleanValue() && this.a) ? j$.util.Optional.of(qtz.B) : j$.util.Optional.empty();
        }
        if (i == 4) {
            return java.lang.Boolean.valueOf(this.a && ((defpackage.lgj) obj) != defpackage.lgj.f);
        }
        if (i == 5) {
            return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent() && this.a);
        }
        vcx vcxVar = (vcx) obj;
        if (this.a) {
            throw vcxVar;
        }
        return vcxVar.a;
    }
}
