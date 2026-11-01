package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xsv extends defpackage.yeh implements java.lang.Cloneable {
    private java.lang.Object A;
    private java.util.List B;
    private defpackage.xsv C;
    private defpackage.xsv D;
    private java.lang.Float E;
    private boolean F = true;
    private boolean G;
    private boolean H;
    public final defpackage.xsx a;
    public final defpackage.xsk b;
    private final android.content.Context x;
    private final java.lang.Class y;
    private defpackage.xsy z;

    static {
    }

    protected xsv(defpackage.xrr xrrVar, defpackage.xsx xsxVar, java.lang.Class cls, android.content.Context context) {
        this.a = xsxVar;
        this.y = cls;
        this.x = context;
        defpackage.xsk xskVar = xsxVar.a.c;
        defpackage.xsy xsyVar = (defpackage.xsy) xskVar.c.get(cls);
        if (xsyVar == null) {
            for (java.util.Map.Entry entry : xskVar.c.entrySet()) {
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    xsyVar = (defpackage.xsy) entry.getValue();
                }
            }
        }
        this.z = xsyVar == null ? defpackage.xsk.a : xsyVar;
        this.b = xrrVar.c;
        java.util.Iterator it = xsxVar.d.iterator();
        while (it.hasNext()) {
            a((defpackage.yeo) it.next());
        }
        i(xsxVar.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xsv, yeh] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsv, yeh] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [yek] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v2, types: [yei, yem] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final defpackage.yek R(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.yeo yeoVar, defpackage.yem yemVar, defpackage.xsy xsyVar, defpackage.xsm xsmVar, int i, int i2, defpackage.yeh yehVar, java.util.concurrent.Executor executor) {
        ?? r11;
        defpackage.yem yeiVar;
        defpackage.yek yekVarS;
        defpackage.xsm xsmVar2;
        defpackage.xsv xsvVar = this;
        defpackage.yeh yehVar2 = yehVar;
        if (xsvVar.D != null) {
            yeiVar = new defpackage.yei(obj, yemVar);
            r11 = yeiVar;
        } else {
            r11 = 0;
            yeiVar = yemVar;
        }
        defpackage.xsv xsvVar2 = xsvVar.C;
        if (xsvVar2 == null) {
            yekVarS = xsvVar.S(obj, yfaVar, yeoVar, yehVar2, yeiVar, xsyVar, xsmVar, i, i2, executor);
        } else {
            if (xsvVar.H) {
                throw new java.lang.IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            defpackage.xsy xsyVar2 = true == xsvVar2.F ? xsyVar : xsvVar2.z;
            if (super.L(8)) {
                xsmVar2 = xsvVar2.e;
            } else {
                int i3 = defpackage.xsu.b[xsmVar.ordinal()];
                if (i3 == 1) {
                    xsmVar2 = defpackage.xsm.c;
                } else if (i3 == 2) {
                    xsmVar2 = defpackage.xsm.b;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new java.lang.IllegalArgumentException("unknown priority: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(xsvVar.e))));
                    }
                    xsmVar2 = defpackage.xsm.a;
                }
            }
            defpackage.xsm xsmVar3 = xsmVar2;
            defpackage.xsv xsvVar3 = xsvVar.C;
            int i4 = xsvVar3.l;
            int i5 = xsvVar3.k;
            if (defpackage.ygc.l(i, i2) && !xsvVar.C.M()) {
                i4 = yehVar2.l;
                i5 = yehVar2.k;
            }
            int i6 = i5;
            defpackage.yes yesVar = new defpackage.yes(obj, yeiVar);
            defpackage.yek yekVarS2 = xsvVar.S(obj, yfaVar, yeoVar, yehVar2, yesVar, xsyVar, xsmVar, i, i2, executor);
            xsvVar.H = true;
            ?? r0 = xsvVar.C;
            defpackage.yek yekVarR = r0.R(obj, yfaVar, yeoVar, yesVar, xsyVar2, xsmVar3, i4, i6, r0, executor);
            defpackage.yes yesVar2 = yesVar;
            xsvVar.H = false;
            yesVar2.a = yekVarS2;
            yesVar2.b = yekVarR;
            yehVar2 = yehVar;
            xsvVar = xsvVar;
            yekVarS = yesVar2;
        }
        defpackage.yek yekVar = yekVarS;
        if (r11 == 0) {
            return yekVar;
        }
        defpackage.xsv xsvVar4 = xsvVar.D;
        int i7 = xsvVar4.l;
        int i8 = xsvVar4.k;
        if (defpackage.ygc.l(i, i2) && !xsvVar.D.M()) {
            i7 = yehVar2.l;
            i8 = yehVar2.k;
        }
        ?? r1 = xsvVar.D;
        ?? r4 = r11;
        defpackage.yek yekVarR2 = r1.R(obj, yfaVar, yeoVar, r4, r1.z, r1.e, i7, i8, r1, executor);
        r4.a = yekVar;
        r4.b = yekVarR2;
        return r11;
    }

    private final defpackage.yek S(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.yeo yeoVar, defpackage.yeh yehVar, defpackage.yem yemVar, defpackage.xsy xsyVar, defpackage.xsm xsmVar, int i, int i2, java.util.concurrent.Executor executor) {
        java.lang.Object obj2 = this.A;
        java.lang.Class cls = this.y;
        java.util.List list = this.B;
        defpackage.yfj yfjVar = xsyVar.a;
        defpackage.xsk xskVar = this.b;
        return new defpackage.yer(xskVar, obj, obj2, cls, yehVar, i, i2, xsmVar, yfaVar, yeoVar, list, yemVar, xskVar.d, yfjVar, executor);
    }

    public defpackage.xsv a(defpackage.yeo yeoVar) {
        if (this.u) {
            return j().a(yeoVar);
        }
        if (yeoVar != null) {
            if (this.B == null) {
                this.B = new java.util.ArrayList();
            }
            this.B.add(yeoVar);
        }
        P();
        return this;
    }

    @Override // defpackage.yeh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public defpackage.xsv i(defpackage.yeh yehVar) {
        anty.aI(yehVar, "Argument must not be null");
        return (defpackage.xsv) super.i(yehVar);
    }

    @Override // defpackage.yeh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public defpackage.xsv j() {
        defpackage.xsv xsvVar = (defpackage.xsv) super.j();
        xsvVar.z = xsvVar.z.clone();
        java.util.List list = xsvVar.B;
        if (list != null) {
            xsvVar.B = new java.util.ArrayList(list);
        }
        defpackage.xsv xsvVar2 = xsvVar.C;
        if (xsvVar2 != null) {
            xsvVar.C = xsvVar2.j();
        }
        defpackage.xsv xsvVar3 = xsvVar.D;
        if (xsvVar3 != null) {
            xsvVar.D = xsvVar3.j();
        }
        return xsvVar;
    }

    public defpackage.xsv d(defpackage.yeo yeoVar) {
        if (this.u) {
            return j().d(yeoVar);
        }
        this.B = null;
        return a(yeoVar);
    }

    public defpackage.xsv e(android.net.Uri uri) {
        android.content.pm.PackageInfo packageInfo;
        defpackage.xsv xsvVarG = g(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return xsvVarG;
        }
        android.content.Context context = this.x;
        defpackage.xsv xsvVar = (defpackage.xsv) xsvVarG.F(context.getTheme());
        java.util.concurrent.ConcurrentMap concurrentMap = defpackage.yfl.a;
        java.lang.String packageName = context.getPackageName();
        defpackage.xuo xuoVar = (defpackage.xuo) defpackage.yfl.a.get(packageName);
        if (xuoVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e("AppVersionSignature", "Cannot resolve info for".concat(java.lang.String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            defpackage.yfn yfnVar = new defpackage.yfn(packageInfo != null ? java.lang.String.valueOf(packageInfo.versionCode) : java.util.UUID.randomUUID().toString());
            xuoVar = (defpackage.xuo) defpackage.yfl.a.putIfAbsent(packageName, yfnVar);
            if (xuoVar == null) {
                xuoVar = yfnVar;
            }
        }
        return (defpackage.xsv) xsvVar.E(new defpackage.yfk(context.getResources().getConfiguration().uiMode & 48, xuoVar));
    }

    @Override // defpackage.yeh
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xsv)) {
            return false;
        }
        defpackage.xsv xsvVar = (defpackage.xsv) obj;
        if (!super.equals(xsvVar) || !j$.util.Objects.equals(this.y, xsvVar.y) || !this.z.equals(xsvVar.z) || !j$.util.Objects.equals(this.A, xsvVar.A) || !j$.util.Objects.equals(this.B, xsvVar.B) || !j$.util.Objects.equals(this.C, xsvVar.C) || !j$.util.Objects.equals(this.D, xsvVar.D)) {
            return false;
        }
        java.lang.Float f = xsvVar.E;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.F == xsvVar.F && this.G == xsvVar.G;
    }

    public defpackage.xsv f(java.lang.Object obj) {
        return g(obj);
    }

    public final defpackage.xsv g(java.lang.Object obj) {
        if (this.u) {
            return j().g(obj);
        }
        this.A = obj;
        this.G = true;
        P();
        return this;
    }

    public defpackage.xsv h(defpackage.xsy xsyVar) {
        if (this.u) {
            return j().h(xsyVar);
        }
        this.z = xsyVar;
        this.F = false;
        P();
        return this;
    }

    @Override // defpackage.yeh
    public final int hashCode() {
        return (((defpackage.ygc.c(null, defpackage.ygc.c(this.D, defpackage.ygc.c(this.C, defpackage.ygc.c(this.B, defpackage.ygc.c(this.A, defpackage.ygc.c(this.z, defpackage.ygc.c(this.y, super.hashCode()))))))) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0);
    }

    public final void k(defpackage.yfa yfaVar) {
        l(yfaVar, null, this, defpackage.yfu.a);
    }

    public final void l(defpackage.yfa yfaVar, defpackage.yeo yeoVar, defpackage.yeh yehVar, java.util.concurrent.Executor executor) {
        anty.aI(yfaVar, "Argument must not be null");
        if (!this.G) {
            throw new java.lang.IllegalArgumentException("You must call #load() before calling #into()");
        }
        defpackage.yek yekVarR = R(new java.lang.Object(), yfaVar, yeoVar, null, this.z, yehVar.e, yehVar.l, yehVar.k, yehVar, executor);
        defpackage.yek yekVarF = yfaVar.f();
        if (!yekVarR.m(yekVarF) || (!yehVar.j && yekVarF.l())) {
            defpackage.xsx xsxVar = this.a;
            xsxVar.h(yfaVar);
            yfaVar.m(yekVarR);
            xsxVar.p(yfaVar, yekVarR);
            return;
        }
        anty.aI(yekVarF, "Argument must not be null");
        if (yekVarF.n()) {
            return;
        }
        yekVarF.b();
    }

    public final void m(android.widget.ImageView imageView) {
        defpackage.yeh yehVarU;
        defpackage.yfa yexVar;
        defpackage.ygc.g();
        anty.aI(imageView, "Argument must not be null");
        if (!super.L(2048) && this.o && imageView.getScaleType() != null) {
            switch (defpackage.xsu.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    yehVarU = j().u();
                    break;
                case 2:
                    yehVarU = j().v();
                    break;
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    yehVarU = j().w();
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    yehVarU = j().v();
                    break;
                default:
                    yehVarU = this;
                    break;
            }
        } else {
            yehVarU = this;
        }
        defpackage.xsk xskVar = this.b;
        java.lang.Class cls = this.y;
        defpackage.xfh xfhVar = xskVar.h;
        if (android.graphics.Bitmap.class.equals(cls)) {
            yexVar = new defpackage.yeu(imageView);
        } else {
            if (!android.graphics.drawable.Drawable.class.isAssignableFrom(cls)) {
                throw new java.lang.IllegalArgumentException(a.bJ(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
            }
            yexVar = new defpackage.yex(imageView);
        }
        l(yexVar, null, yehVarU, defpackage.yfu.a);
    }
}
