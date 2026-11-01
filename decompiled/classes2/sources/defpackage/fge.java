package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fge extends defpackage.ffb {
    private static final defpackage.eqt e;
    private final defpackage.ffw[] f;
    private final java.util.List g;
    private final defpackage.erm[] h;
    private final java.util.ArrayList i;
    private int j = -1;
    private long[][] k;
    private defpackage.fgd l;

    static {
        defpackage.eqk eqkVar = new defpackage.eqk();
        eqkVar.a = "MergingMediaSource";
        e = eqkVar.a();
    }

    public fge(defpackage.ffw... ffwVarArr) {
        this.f = ffwVarArr;
        this.i = new java.util.ArrayList(java.util.Arrays.asList(ffwVarArr));
        this.g = new java.util.ArrayList(ffwVarArr.length);
        int i = 0;
        while (true) {
            int length = ffwVarArr.length;
            if (i >= length) {
                this.h = new defpackage.erm[length];
                this.k = new long[0][];
                new java.util.HashMap();
                defpackage.aijf aijfVar = new defpackage.aijf();
                j$.util.Objects.requireNonNull(aijfVar);
                ahvr.az(aijfVar);
                return;
            }
            this.g.add(new java.util.ArrayList());
            i++;
        }
    }

    @Override // defpackage.ffw
    public final defpackage.ffs A(defpackage.ffu ffuVar, defpackage.fio fioVar, long j) {
        defpackage.erm[] ermVarArr = this.h;
        defpackage.ffw[] ffwVarArr = this.f;
        int length = ffwVarArr.length;
        defpackage.ffs[] ffsVarArr = new defpackage.ffs[length];
        int iA = ermVarArr[0].a(ffuVar.a);
        for (int i = 0; i < length; i++) {
            defpackage.ffu ffuVarA = ffuVar.a(ermVarArr[i].f(iA));
            ffsVarArr[i] = ffwVarArr[i].A(ffuVarA, fioVar, j - this.k[iA][i]);
            ((java.util.List) this.g.get(i)).add(new defpackage.kvt(ffuVarA, ffsVarArr[i], (byte[]) null));
        }
        return new defpackage.fgc(this.k[iA], ffsVarArr);
    }

    @Override // defpackage.ffw
    public final void E(defpackage.ffs ffsVar) {
        defpackage.fgc fgcVar = (defpackage.fgc) ffsVar;
        int i = 0;
        while (true) {
            defpackage.ffw[] ffwVarArr = this.f;
            if (i >= ffwVarArr.length) {
                return;
            }
            java.util.List list = (java.util.List) this.g.get(i);
            defpackage.ffs ffsVarK = fgcVar.k(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((defpackage.kvt) list.get(i2)).b.equals(ffsVarK)) {
                    list.remove(i2);
                    break;
                }
            }
            ffwVarArr[i].E(fgcVar.k(i));
            i++;
        }
    }

    @Override // defpackage.ffw
    public final defpackage.eqt F() {
        defpackage.ffw[] ffwVarArr = this.f;
        return ffwVarArr.length > 0 ? ffwVarArr[0].F() : e;
    }

    @Override // defpackage.ffb, defpackage.few
    protected final void i(defpackage.ewm ewmVar) {
        super.i(ewmVar);
        int i = 0;
        while (true) {
            defpackage.ffw[] ffwVarArr = this.f;
            if (i >= ffwVarArr.length) {
                return;
            }
            w(java.lang.Integer.valueOf(i), ffwVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ffb, defpackage.few
    protected final void l() {
        super.l();
        java.util.Arrays.fill(this.h, (java.lang.Object) null);
        this.j = -1;
        this.l = null;
        java.util.ArrayList arrayList = this.i;
        arrayList.clear();
        java.util.Collections.addAll(arrayList, this.f);
    }

    @Override // defpackage.few, defpackage.ffw
    public final void o(defpackage.eqt eqtVar) {
        this.f[0].o(eqtVar);
    }

    @Override // defpackage.ffb
    protected final /* bridge */ /* synthetic */ defpackage.ffu t(java.lang.Object obj, defpackage.ffu ffuVar) {
        java.lang.Object obj2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        java.util.List list = this.g;
        java.util.List list2 = (java.util.List) list.get(iIntValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((defpackage.ffu) ((defpackage.kvt) list2.get(i)).a).equals(ffuVar)) {
                obj2 = ((defpackage.kvt) ((java.util.List) list.get(0)).get(i)).a;
                return (defpackage.ffu) obj2;
            }
        }
        obj2 = null;
        return (defpackage.ffu) obj2;
    }

    @Override // defpackage.ffb, defpackage.ffw
    public final void u() throws defpackage.fgd {
        defpackage.fgd fgdVar = this.l;
        if (fgdVar != null) {
            throw fgdVar;
        }
        super.u();
    }

    @Override // defpackage.ffb
    protected final /* bridge */ /* synthetic */ void v(java.lang.Object obj, defpackage.ffw ffwVar, defpackage.erm ermVar) {
        int iB;
        if (this.l == null) {
            if (this.j == -1) {
                iB = ermVar.b();
                this.j = iB;
            } else {
                int iB2 = ermVar.b();
                int i = this.j;
                if (iB2 != i) {
                    this.l = new defpackage.fgd();
                    return;
                }
                iB = i;
            }
            if (this.k.length == 0) {
                this.k = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, iB, this.h.length);
            }
            java.util.ArrayList arrayList = this.i;
            arrayList.remove(ffwVar);
            defpackage.erm[] ermVarArr = this.h;
            ermVarArr[((java.lang.Integer) obj).intValue()] = ermVar;
            if (arrayList.isEmpty()) {
                j(ermVarArr[0]);
            }
        }
    }
}
