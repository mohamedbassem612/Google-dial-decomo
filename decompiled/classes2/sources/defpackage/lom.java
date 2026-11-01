package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lom extends defpackage.gbv {
    public static final aimz e = aimz.i("com/android/dialer/chocolatechip/impl/ui/ContactsPagingAdapter");
    private final android.content.Context f;
    private final java.util.Map g;
    private android.net.Uri h;
    private final rai i;
    private final rai j;
    private final rai k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lom(android.content.Context context, rai raiVar, rai raiVar2, rai raiVar3, aolr aolrVar, aolr aolrVar2) {
        super(new defpackage.kj((char[]) null), aolrVar, aolrVar2);
        aooh.f(raiVar2, "contactViewHolderFactory");
        aooh.f(raiVar3, "addContactViewHolderFactory");
        aooh.f(aolrVar, "mainContext");
        aooh.f(aolrVar2, "backgroundContext");
        this.f = context;
        this.i = raiVar;
        this.k = raiVar2;
        this.j = raiVar3;
        this.g = new java.util.LinkedHashMap();
    }

    public final int b(int i) {
        return i == 0 ? 1 : 2;
    }

    public final ld d(android.view.ViewGroup viewGroup, int i) {
        if (i == 0) {
            throw new java.lang.IllegalStateException(a.bj(i, "Invalid view type: "));
        }
        if (i == 1) {
            rai raiVar = this.j;
            android.view.View viewInflate = android.view.LayoutInflater.from(this.f).inflate(2131623999, viewGroup, false);
            aooh.e(viewInflate, "inflate(...)");
            return new defpackage.lob(viewInflate, (rlv) ((hir) raiVar.a).a.fq.a());
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException(a.bj(i, "Invalid view type: "));
        }
        rai raiVar2 = this.k;
        android.view.View viewInflate2 = android.view.LayoutInflater.from(this.f).inflate(2131624108, viewGroup, false);
        aooh.e(viewInflate2, "inflate(...)");
        rai raiVar3 = this.i;
        defpackage.him himVar = ((hir) raiVar2.a).a;
        return new defpackage.lok((rlv) himVar.fq.a(), (ops) himVar.BM.a(), himVar.a.cw(), viewInflate2, raiVar3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    public final void m(ld ldVar, int i) {
        java.lang.Object objC;
        java.lang.Object objC2;
        java.lang.Object objC3;
        boolean z;
        java.lang.String string;
        aooh.f(ldVar, "viewHolder");
        if (ldVar instanceof defpackage.lob) {
            return;
        }
        defpackage.lok lokVar = (defpackage.lok) ldVar;
        defpackage.fyr fyrVar = this.a;
        try {
            aozj aozjVar = fyrVar.m;
            do {
                objC2 = aozjVar.c();
                ((java.lang.Boolean) objC2).booleanValue();
            } while (!aozjVar.f(objC2, java.lang.Boolean.TRUE));
            fyrVar.c = i;
            gcr gcrVar = (gcr) fyrVar.d.get();
            java.lang.Object objY = gcrVar != null ? defpackage.hgu.Y(gcrVar, i) : fyrVar.e.c(i);
            aozj aozjVar2 = fyrVar.m;
            do {
                objC3 = aozjVar2.c();
                ((java.lang.Boolean) objC3).booleanValue();
            } while (!aozjVar2.f(objC3, java.lang.Boolean.FALSE));
            defpackage.lns lnsVar = (defpackage.lns) objY;
            if (lnsVar == null) {
                lokVar.u.setVisibility(8);
                lokVar.v.setVisibility(4);
                lokVar.w.setVisibility(4);
                return;
            }
            if (i == a() - 1) {
                z = true;
            } else {
                defpackage.lns lnsVar2 = (defpackage.lns) w(i + 1);
                if (aooh.n(lnsVar2 != null ? lnsVar2.a : null, lnsVar.a)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            java.lang.String str = lnsVar.a;
            java.lang.String str2 = lnsVar.b;
            android.net.Uri uri = lnsVar.d;
            long j = lnsVar.c;
            android.net.Uri uri2 = lnsVar.e;
            if (uri2 == null || (string = uri2.toString()) == null) {
                string = "";
            }
            boolean z2 = lnsVar.g;
            long j2 = lnsVar.f;
            boolean zN = aooh.n(uri, this.h);
            defpackage.inx inxVar = new defpackage.inx(z2, z);
            aooh.f(str2, "displayName");
            aooh.f(uri, "contactUri");
            aooh.f(string, "photoUri");
            if (str2.length() <= 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            lokVar.x = uri;
            lokVar.y = j;
            android.widget.TextView textView = lokVar.v;
            android.content.Context context = lokVar.t;
            textView.setText(pez.aq(context, str2));
            textView.setVisibility(0);
            android.widget.TextView textView2 = lokVar.u;
            textView2.setText(str);
            textView2.setVisibility(true != z2 ? 8 : 0);
            ops opsVar = lokVar.A;
            android.widget.QuickContactBadge quickContactBadge = lokVar.w;
            akzx akzxVarM = abwd.a.m();
            akzxVarM.u();
            abwd abwdVar = akzxVarM.b;
            abwdVar.b |= 8;
            abwdVar.f = j2;
            akzxVarM.u();
            abwd abwdVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            abwdVar2.b |= 4;
            abwdVar2.e = string;
            akzxVarM.u();
            abwd abwdVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            abwdVar3.b |= 1;
            abwdVar3.c = str2;
            java.lang.String string2 = uri.toString();
            akzxVarM.u();
            abwd abwdVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            abwdVar4.b |= 16;
            abwdVar4.g = string2;
            opsVar.h(quickContactBadge, akzxVarM.p(), false);
            quickContactBadge.setVisibility(0);
            java.lang.String string3 = context.getString(2132018266, str2);
            aooh.e(string3, "getString(...)");
            quickContactBadge.setContentDescription(string3);
            dzs.j(textView2, z2);
            lokVar.s.E(quickContactBadge, 34);
            android.view.View view = lokVar.z;
            view.setBackground(lokVar.B.A(inxVar));
            view.setSelected(zN);
            this.g.put(uri, new defpackage.lol(lokVar, i));
        } catch (java.lang.Throwable th) {
            aozj aozjVar3 = fyrVar.m;
            do {
                objC = aozjVar3.c();
                ((java.lang.Boolean) objC).booleanValue();
            } while (!aozjVar3.f(objC, java.lang.Boolean.FALSE));
            throw th;
        }
    }

    public final void q(ld ldVar) {
        android.net.Uri uri;
        aooh.f(ldVar, "holder");
        defpackage.lok lokVar = ldVar instanceof defpackage.lok ? (defpackage.lok) ldVar : null;
        if (lokVar != null) {
            java.util.Map map = this.g;
            defpackage.lol lolVar = (defpackage.lol) map.get(lokVar.x);
            defpackage.lok lokVar2 = true == aooh.n(lolVar != null ? lolVar.a : null, lokVar) ? lokVar : null;
            if (lokVar2 == null || (uri = lokVar2.x) == null) {
                return;
            }
        }
    }

    public final void y(android.net.Uri uri) {
        if (aooh.n(this.h, uri)) {
            return;
        }
        android.net.Uri uri2 = this.h;
        this.h = uri;
        java.util.Map map = this.g;
        defpackage.lol lolVar = (defpackage.lol) map.get(uri2);
        if (lolVar != null) {
            f(lolVar.b);
        }
        defpackage.lol lolVar2 = (defpackage.lol) map.get(uri);
        if (lolVar2 != null) {
            f(lolVar2.b);
        }
    }
}
