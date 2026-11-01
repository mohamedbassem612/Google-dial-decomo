package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nli implements defpackage.nmm {
    private final /* synthetic */ int $cid;
    private java.lang.Enum a;

    public nli(int i) {
        this.$cid = i;
        this.a = defpackage.nmr.REASON_UNKNOWN;
    }

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(nmkVar, "event");
            int i2 = nmkVar.b;
            if (i2 == 6) {
                defpackage.nmr nmrVarB = defpackage.nmr.b((i2 == 6 ? (defpackage.nmb) nmkVar.c : defpackage.nmb.a).b);
                if (nmrVarB == null) {
                    nmrVarB = defpackage.nmr.UNRECOGNIZED;
                }
                if (nmrVarB != this.a) {
                    this.a = nmrVarB;
                    return defpackage.nml.c;
                }
            }
            return defpackage.nml.a;
        }
        if (i == 1) {
            aooh.f(nmkVar, "event");
            int i3 = nmkVar.b;
            if (i3 == 5) {
                defpackage.nmq nmqVarB = defpackage.nmq.b((i3 == 5 ? (defpackage.nma) nmkVar.c : defpackage.nma.a).b);
                if (nmqVarB == null) {
                    nmqVarB = defpackage.nmq.UNRECOGNIZED;
                }
                if (nmqVarB != this.a) {
                    this.a = nmqVarB;
                    return defpackage.nml.c;
                }
            }
            return defpackage.nml.a;
        }
        if (i == 2) {
            aooh.f(nmkVar, "event");
            defpackage.oet oetVarB = defpackage.oet.b((nmkVar.b == 17 ? (defpackage.nlq) nmkVar.c : defpackage.nlq.a).b);
            if (oetVarB == null) {
                oetVarB = defpackage.oet.UNRECOGNIZED;
            }
            if (oetVarB == defpackage.oet.UNKNOWN) {
                return defpackage.nml.a;
            }
            defpackage.oet oetVarB2 = defpackage.oet.b((nmkVar.b == 17 ? (defpackage.nlq) nmkVar.c : defpackage.nlq.a).b);
            if (oetVarB2 == null) {
                oetVarB2 = defpackage.oet.UNRECOGNIZED;
            }
            this.a = oetVarB2;
            return defpackage.nml.b;
        }
        if (i == 3) {
            aooh.f(nmkVar, "event");
            int i4 = nmkVar.b;
            if (i4 == 22) {
                defpackage.nmn nmnVarB = defpackage.nmn.b((i4 == 22 ? (defpackage.nln) nmkVar.c : defpackage.nln.a).b);
                if (nmnVarB == null) {
                    nmnVarB = defpackage.nmn.UNRECOGNIZED;
                }
                if (nmnVarB != this.a) {
                    this.a = nmnVarB;
                    return defpackage.nml.b;
                }
            }
            return defpackage.nml.a;
        }
        if (i != 4) {
            aooh.f(nmkVar, "event");
            int i5 = nmkVar.b;
            if (i5 == 13) {
                defpackage.nms nmsVarB = defpackage.nms.b((i5 == 13 ? (defpackage.nmd) nmkVar.c : defpackage.nmd.a).b);
                if (nmsVarB == null) {
                    nmsVarB = defpackage.nms.UNRECOGNIZED;
                }
                if (nmsVarB != this.a) {
                    this.a = nmsVarB;
                    return defpackage.nml.b;
                }
            }
            return defpackage.nml.a;
        }
        aooh.f(nmkVar, "event");
        int i6 = nmkVar.b;
        if (i6 == 20) {
            defpackage.nms nmsVarB2 = defpackage.nms.b((i6 == 20 ? (defpackage.nmc) nmkVar.c : defpackage.nmc.a).b);
            if (nmsVarB2 == null) {
                nmsVarB2 = defpackage.nms.UNRECOGNIZED;
            }
            if (nmsVarB2 != this.a) {
                this.a = nmsVarB2;
                return defpackage.nml.b;
            }
        }
        return defpackage.nml.a;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
            java.lang.Enum r5 = this.a;
            aooh.f(r5, "value");
            akzx akzxVar = (akzx) nwjVarJ.a;
            akzxVar.u();
            defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
            nmuVar2.g = ((defpackage.nmr) r5).a();
            nmuVar2.b |= 8;
            return nwjVarJ.s();
        }
        if (i == 1) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ2 = mni.J(nmuVar.p());
            java.lang.Enum r6 = this.a;
            aooh.f(r6, "value");
            akzx akzxVar2 = (akzx) nwjVarJ2.a;
            akzxVar2.u();
            defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar2.b;
            nmuVar3.f = ((defpackage.nmq) r6).a();
            nmuVar3.b |= 4;
            return nwjVarJ2.s();
        }
        if (i == 2) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ3 = mni.J(nmuVar.p());
            java.lang.Enum r7 = this.a;
            aooh.f(r7, "value");
            akzx akzxVar3 = (akzx) nwjVarJ3.a;
            akzxVar3.u();
            defpackage.nmu nmuVar4 = (defpackage.nmu) akzxVar3.b;
            nmuVar4.x = ((defpackage.oet) r7).a();
            nmuVar4.b |= 262144;
            return nwjVarJ3.s();
        }
        if (i == 3) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ4 = mni.J(nmuVar.p());
            java.lang.Enum r8 = this.a;
            if (r8 != defpackage.nmn.CALL_SCREEN_INTENT_LABEL_UNKNOWN) {
                aooh.f(r8, "value");
                akzx akzxVar4 = (akzx) nwjVarJ4.a;
                akzxVar4.u();
                defpackage.nmu nmuVar5 = (defpackage.nmu) akzxVar4.b;
                nmuVar5.A = ((defpackage.nmn) r8).a();
                nmuVar5.b |= 2097152;
            }
            return nwjVarJ4.s();
        }
        if (i != 4) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ5 = mni.J(nmuVar.p());
            java.lang.Enum r9 = this.a;
            aooh.f(r9, "value");
            akzx akzxVar5 = (akzx) nwjVarJ5.a;
            akzxVar5.u();
            ((defpackage.nmu) akzxVar5.b).s = ((defpackage.nms) r9).a();
            return nwjVarJ5.s();
        }
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ6 = mni.J(nmuVar.p());
        java.lang.Enum r10 = this.a;
        aooh.f(r10, "value");
        akzx akzxVar6 = (akzx) nwjVarJ6.a;
        akzxVar6.u();
        ((defpackage.nmu) akzxVar6.b).t = ((defpackage.nms) r10).a();
        return nwjVarJ6.s();
    }

    public nli(int i, byte[] bArr) {
        this.$cid = i;
        this.a = defpackage.nmq.NO_DECISION;
    }

    public nli(int i, char[] cArr) {
        this.$cid = i;
        this.a = defpackage.oet.UNKNOWN;
    }

    public nli(int i, int[] iArr) {
        this.$cid = i;
        this.a = defpackage.nms.CASE_NO_SESSION;
    }

    public nli(int i, short[] sArr) {
        this.$cid = i;
        this.a = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_UNKNOWN;
    }
}
