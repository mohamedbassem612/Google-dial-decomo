package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlh implements defpackage.nmm {
    private final /* synthetic */ int $cid;
    private final java.util.List a = new java.util.ArrayList();
    private boolean b;

    public nlh(int i, byte[] bArr) {
        this.$cid = i;
    }

    @Override // defpackage.nmm
    public final defpackage.nml a(defpackage.nmk nmkVar) {
        if (this.$cid == 0) {
            aooh.f(nmkVar, "event");
            int i = nmkVar.b;
            if (i == 12) {
                this.b = ((defpackage.nlm) nmkVar.c).c;
                return defpackage.nml.c;
            }
            if (i != 4) {
                return defpackage.nml.a;
            }
            defpackage.nmp nmpVar = ((defpackage.nlz) nmkVar.c).c;
            if (nmpVar == null) {
                nmpVar = defpackage.nmp.a;
            }
            aooh.e(nmpVar, "getNewDuplexRecording(...)");
            this.a.add(nmpVar);
            return defpackage.nml.c;
        }
        aooh.f(nmkVar, "event");
        int i2 = nmkVar.b;
        if (i2 == 8) {
            alat alatVar = ((defpackage.nly) nmkVar.c).b;
            aooh.e(alatVar, "getDuplexQuickReplyChipsList(...)");
            java.util.List list = this.a;
            list.clear();
            list.addAll(alatVar);
            return defpackage.nml.c;
        }
        if (i2 == 10) {
            alsj alsjVar = ((defpackage.nlp) nmkVar.c).c;
            if (alsjVar == null) {
                alsjVar = alsj.a;
            }
            aooh.e(alsjVar, "getDuplexQuickReplyChip(...)");
            if (aooh.n(alsjVar.c, "SuggestLeavingMessage")) {
                this.b = true;
                return defpackage.nml.c;
            }
        }
        return defpackage.nml.a;
    }

    @Override // defpackage.nmm
    public final defpackage.nmu b(defpackage.nmu nmuVar) {
        if (this.$cid != 0) {
            aooh.f(nmuVar, "model");
            defpackage.nwj nwjVarJ = mni.J(nmuVar.p());
            akzx akzxVar = (akzx) nwjVarJ.a;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.nmu) akzxVar.b).i);
            aooh.e(listUnmodifiableList, "getDuplexQuickReplyChipsList(...)");
            new alct(listUnmodifiableList);
            akzxVar.u();
            defpackage.nmu nmuVar2 = (defpackage.nmu) akzxVar.b;
            alat alatVar = nmuVar2.i;
            if (!alatVar.c()) {
                nmuVar2.i = alad.J(alatVar);
            }
            akyl.i(this.a, nmuVar2.i);
            boolean z = this.b;
            akzxVar.u();
            defpackage.nmu nmuVar3 = (defpackage.nmu) akzxVar.b;
            nmuVar3.b |= 256;
            nmuVar3.n = z;
            return nwjVarJ.s();
        }
        aooh.f(nmuVar, "model");
        defpackage.nwj nwjVarJ2 = mni.J(nmuVar.p());
        akzx akzxVar2 = (akzx) nwjVarJ2.a;
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.nmu) akzxVar2.b).e);
        aooh.e(listUnmodifiableList2, "getDuplexRecordingsList(...)");
        new alct(listUnmodifiableList2);
        akzxVar2.u();
        defpackage.nmu nmuVar4 = (defpackage.nmu) akzxVar2.b;
        alat alatVar2 = nmuVar4.e;
        if (!alatVar2.c()) {
            nmuVar4.e = alad.J(alatVar2);
        }
        akyl.i(this.a, nmuVar4.e);
        boolean z2 = this.b;
        akzxVar2.u();
        defpackage.nmu nmuVar5 = (defpackage.nmu) akzxVar2.b;
        nmuVar5.b |= 8192;
        nmuVar5.r = z2;
        return nwjVarJ2.s();
    }

    public nlh(int i) {
        this.$cid = i;
    }
}
