package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzo extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzo(defpackage.gac gacVar, defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = gacVar;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.jzo jzoVar = new defpackage.jzo((defpackage.jzy) this.c, (defpackage.aoln) obj3, 0);
            jzoVar.a = (java.lang.Long) obj;
            jzoVar.b = (java.util.List) obj2;
            return jzoVar.b(defpackage.aojh.a);
        }
        if (i != 1) {
            defpackage.jzo jzoVar2 = new defpackage.jzo((defpackage.kgl) this.c, (defpackage.aoln) obj3, 2);
            jzoVar2.a = (java.util.List) obj;
            jzoVar2.b = (java.util.List) obj2;
            return jzoVar2.b(defpackage.aojh.a);
        }
        defpackage.jzo jzoVar3 = new defpackage.jzo((defpackage.gac) this.c, (defpackage.aoln) obj3, 1);
        jzoVar3.a = (defpackage.fzs) obj;
        jzoVar3.b = (defpackage.fzs) obj2;
        return jzoVar3.b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object next;
        defpackage.aify aifyVarBv;
        java.lang.Object kbyVar;
        java.lang.String str;
        defpackage.kgc kgcVar;
        int i = this.$cid;
        java.lang.String str2 = null;
        java.lang.Object obj2 = null;
        str2 = null;
        str2 = null;
        str2 = null;
        if (i == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj3 = this.a;
            ?? r0 = this.b;
            if (obj3 == null) {
                return null;
            }
            java.util.Iterator it = r0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((defpackage.kiu) next).d != ((java.lang.Long) obj3).longValue());
            defpackage.kiu kiuVar = (defpackage.kiu) next;
            if (kiuVar == null) {
                return null;
            }
            java.lang.Object obj4 = this.c;
            try {
                defpackage.gou gouVar = ((defpackage.jzy) obj4).g;
                android.content.Context context = ((defpackage.jzy) obj4).f;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                orc orcVar = new orc(context, gouVar.d(kiuVar));
                if (((defpackage.ssq) gouVar.a).c(kiuVar.g, kiuVar.i)) {
                    orcVar.i();
                    orcVar.k();
                    orcVar.j(((defpackage.aeqx) gouVar.b).d(kiuVar, true).toString(), (defpackage.az) null, kiuVar);
                    java.lang.Object obj5 = gouVar.d;
                    if (((defpackage.tkl) obj5).t(kiuVar) || ((defpackage.tkl) obj5).u(kiuVar)) {
                        orcVar.d();
                    } else {
                        orcVar.q(11);
                    }
                }
                orcVar.e((defpackage.az) null, kiuVar);
                orcVar.g((defpackage.az) null, kiuVar);
                orcVar.f((defpackage.az) null, kiuVar);
                orcVar.h((defpackage.az) null, kiuVar);
                java.util.List listA = orcVar.a();
                listA.add(defpackage.gou.c(context, kiuVar));
                optionalEmpty.isPresent();
                j$.util.Objects.requireNonNull(listA);
                optionalEmpty.isPresent();
                aifyVarBv = defpackage.ahvr.bv(listA);
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jzy.a.d()).k(e).l("com/android/dialer/calllog/compose/data/CallLogUiModelMapper", "toCallLogPopupMenuUiModel", 134, "CallLogUiModelMapper.kt")).v("Failed to build popup menu modules for call log entry.");
                aifyVarBv = defpackage.aike.a;
            }
            long j = kiuVar.d;
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            if (!kiwVar.r) {
                if (kiuVar.s) {
                    java.lang.String str3 = kiuVar.t;
                    defpackage.aooh.e(str3, "getVoicemailCallTag(...)");
                    if (str3.length() <= 0) {
                        str = kiuVar.h;
                        defpackage.aooh.e(str, "getFormattedNumber(...)");
                        if (str.length() != 0 && !((defpackage.jzy) obj4).j.r(kiuVar.i).isPresent()) {
                            str2 = kiuVar.h;
                        }
                    }
                } else {
                    str = kiuVar.h;
                    defpackage.aooh.e(str, "getFormattedNumber(...)");
                    if (str.length() != 0) {
                        str2 = kiuVar.h;
                    }
                }
            }
            if (aifyVarBv == null) {
                defpackage.aooh.g();
            }
            kbyVar = new defpackage.kby(j, str2, aifyVarBv);
        } else {
            if (i != 1) {
                defpackage.aooc.af(obj);
                ?? r10 = this.a;
                for (java.lang.Object obj6 : this.b) {
                    if (((defpackage.kgk) obj6).b) {
                        obj2 = obj6;
                        break;
                    }
                }
                defpackage.kgk kgkVar = (defpackage.kgk) obj2;
                return (kgkVar == null || (kgcVar = kgkVar.a) == null) ? r10 : ((defpackage.kgl) this.c).a(kgcVar).c(r10);
            }
            java.lang.Object obj7 = this.a;
            kbyVar = this.b;
            defpackage.aooc.af(obj);
            defpackage.aooh.f(kbyVar, "<this>");
            defpackage.aooh.f(obj7, "previous");
            defpackage.fzs fzsVar = (defpackage.fzs) kbyVar;
            int i2 = fzsVar.a;
            defpackage.fzs fzsVar2 = (defpackage.fzs) obj7;
            int i3 = fzsVar2.a;
            if (!(i2 <= i3 ? i2 < i3 ? false : defpackage.dzn.o(fzsVar.b, fzsVar2.b, (defpackage.gac) this.c) : true)) {
                return obj7;
            }
        }
        return kbyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzo(defpackage.jzy jzyVar, defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = jzyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzo(defpackage.kgl kglVar, defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = kglVar;
    }
}
