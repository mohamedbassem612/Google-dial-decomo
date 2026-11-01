package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvn extends aomh implements aonn {
    int a;
    final /* synthetic */ abvp b;
    final /* synthetic */ android.net.Uri c;
    final /* synthetic */ defpackage.afaw d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ defpackage.amjp f;
    final /* synthetic */ java.lang.String g;
    final /* synthetic */ java.lang.String h;
    final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvn(abvp abvpVar, android.net.Uri uri, defpackage.afaw afawVar, java.lang.String str, defpackage.amjp amjpVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, aoln aolnVar) {
        super(2, aolnVar);
        this.b = abvpVar;
        this.c = uri;
        this.d = afawVar;
        this.e = str;
        this.f = amjpVar;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.abui abuiVar;
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.abvm abvmVar = new defpackage.abvm(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
                this.a = 1;
                obj = aooh.K(5000L, abvmVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            return (defpackage.abuo) obj;
        } catch (aovk e) {
            abuiVar = new defpackage.abui(defpackage.abuf.s, e);
            return abuiVar;
        } catch (java.io.FileNotFoundException e2) {
            abuiVar = new defpackage.abui(defpackage.abuf.u, e2);
            return abuiVar;
        } catch (java.lang.IllegalStateException e3) {
            abuiVar = new defpackage.abui(defpackage.abuf.v, e3);
            return abuiVar;
        } catch (aacw e4) {
            abuiVar = new defpackage.abui(defpackage.abuf.m, e4);
            return abuiVar;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abvn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, aolnVar);
    }
}
