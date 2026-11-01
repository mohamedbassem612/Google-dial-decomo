package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anyh implements annr {
    private final anvv A;
    private final anve B;
    private final anpm C;
    public final defpackage.anyd a;
    public final java.util.concurrent.ScheduledExecutorService b;
    public final anno c;
    public final anmd d;
    public final boolean e;
    public final java.util.List f;
    public final anrc g;
    public final defpackage.anye h;
    public volatile java.util.List i;
    public final ahzh j;
    public anzu k;
    public defpackage.anwc n;
    public volatile anzu o;
    public anqw q;
    public volatile defpackage.anlw r;
    public final defpackage.aodn s;
    public final java.lang.String t;
    public defpackage.anwx u;
    public defpackage.apjb v;
    public defpackage.apjb w;
    private final anns x;
    private final java.lang.String y;
    private final java.lang.String z;
    public final java.util.Collection l = new java.util.ArrayList();
    public final anxt m = new defpackage.anxy(this);
    public volatile defpackage.anmn p = defpackage.anmn.a(anmm.d);

    public anyh(defpackage.anoc anocVar, java.lang.String str, java.lang.String str2, anvv anvvVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, anrc anrcVar, defpackage.anyd anydVar, anno annoVar, anve anveVar, anns annsVar, anmd anmdVar, java.util.List list, java.lang.String str3, anpm anpmVar) {
        java.lang.Object obj;
        java.util.List list2 = anocVar.a;
        ahvr.bN(!list2.isEmpty(), "addressGroups is empty");
        b(list2, "addressGroups contains null entry");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new defpackage.anye(listUnmodifiableList);
        this.y = str;
        this.z = str2;
        this.A = anvvVar;
        this.b = scheduledExecutorService;
        this.j = new ahzh();
        this.g = anrcVar;
        this.C = anpmVar;
        this.a = anydVar;
        this.c = annoVar;
        this.B = anveVar;
        this.x = annsVar;
        this.d = anmdVar;
        this.f = list;
        defpackage.anob anobVar = defpackage.anon.c;
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = anocVar.c;
            if (i >= objArr.length) {
                obj = anobVar.a;
                break;
            } else {
                if (anobVar.equals(objArr[i][0])) {
                    obj = anocVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((java.lang.Boolean) obj).booleanValue();
        this.t = str3;
        this.s = new defpackage.aodn(anpmVar);
    }

    public static void b(java.util.List list, java.lang.String str) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ahvr.cj(it.next(), str);
        }
    }

    public static final java.lang.String k(anqw anqwVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(anqwVar.o);
        java.lang.String str = anqwVar.p;
        if (str != null) {
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        java.lang.Throwable th = anqwVar.q;
        if (th != null) {
            sb.append('[');
            sb.append(th);
            sb.append(']');
        }
        return sb.toString();
    }

    public final anvs a() {
        anzu anzuVar = this.o;
        if (anzuVar != null) {
            return anzuVar;
        }
        this.g.execute(new defpackage.anwo(this, 6, (byte[]) null));
        return null;
    }

    public final anns c() {
        return this.x;
    }

    public final void d(anmm anmmVar) {
        this.g.c();
        e(defpackage.anmn.a(anmmVar));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [anom, java.lang.Object] */
    public final void e(defpackage.anmn anmnVar) {
        this.g.c();
        anmm anmmVar = this.p.a;
        anmm anmmVar2 = anmnVar.a;
        if (anmmVar != anmmVar2) {
            ahvr.cc(this.p.a != anmm.e, "Cannot transition out of SHUTDOWN to %s", anmmVar2);
            if (this.e && anmmVar2 == anmm.c) {
                this.p = defpackage.anmn.a(anmm.d);
            } else {
                this.p = anmnVar;
            }
            this.a.a.a(anmnVar);
        }
    }

    public final void f() {
        this.g.execute(new defpackage.anwo(this, 8, (char[]) null));
    }

    public final void g(defpackage.anwc anwcVar, boolean z) {
        this.g.execute(new rrq(this, anwcVar, z, 7));
    }

    public final void h(anqw anqwVar) {
        this.g.execute(new anxz(this, anqwVar, 1, (byte[]) null));
    }

    public final void i() {
        defpackage.annj annjVar;
        anrc anrcVar = this.g;
        anrcVar.c();
        ahvr.bZ(this.v == null, "Should have no reconnectTask scheduled");
        defpackage.anye anyeVar = this.h;
        if (anyeVar.b == 0 && anyeVar.c == 0) {
            ahzh ahzhVar = this.j;
            ahzhVar.d();
            ahzhVar.e();
        }
        java.net.SocketAddress socketAddressB = anyeVar.b();
        if (socketAddressB instanceof defpackage.annj) {
            defpackage.annj annjVar2 = (defpackage.annj) socketAddressB;
            annjVar = annjVar2;
            socketAddressB = annjVar2.b;
        } else {
            annjVar = null;
        }
        defpackage.anlw anlwVarA = anyeVar.a();
        java.lang.String str = (java.lang.String) anlwVarA.a(defpackage.anna.a);
        defpackage.anvu anvuVar = new defpackage.anvu();
        if (str == null) {
            str = this.y;
        }
        ahvr.cj(str, "authority");
        anvuVar.a = str;
        anvuVar.b = anlwVarA;
        anvuVar.c = this.z;
        ahvr.cj(this.C, "metricRecorder");
        anvuVar.d = annjVar;
        defpackage.anyg anygVar = new defpackage.anyg();
        anygVar.a = this.x;
        defpackage.anyc anycVar = new defpackage.anyc(this.A.a(socketAddressB, anvuVar, anygVar), this.B);
        anygVar.a = anycVar.c();
        anno.b(this.c.f, anycVar);
        this.n = anycVar;
        this.l.add(anycVar);
        java.lang.Runnable runnableD = anycVar.d(new defpackage.anyf(this, anycVar));
        if (runnableD != null) {
            anrcVar.b(runnableD);
        }
        this.d.b(2, "Started transport {0}", new java.lang.Object[]{anygVar.a});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.f("logId", this.x.b);
        ahymVarL.b("addressGroups", this.i);
        return ahymVarL.toString();
    }
}
