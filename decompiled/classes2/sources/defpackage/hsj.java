package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hsj {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;

    public hsj(java.util.List list) {
        aooh.f(list, "properties");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((izg) it.next()).c;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            java.lang.Object obj2 = ((izg) it2.next()).c;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            java.lang.Object obj3 = ((izg) it3.next()).c;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            java.lang.Object obj4 = ((izg) it4.next()).c;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : list) {
            if (((izg) obj5).c instanceof android.graphics.ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            java.lang.Object obj6 = ((izg) it5.next()).c;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            java.lang.Object obj7 = ((izg) it6.next()).c;
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            java.lang.Object obj8 = ((izg) it7.next()).c;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            java.lang.Object obj9 = ((izg) it8.next()).c;
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            java.lang.Object obj10 = ((izg) it9.next()).c;
        }
        this.i = arrayList;
        this.g = arrayList2;
        this.f = arrayList3;
        this.b = arrayList4;
        this.e = arrayList5;
        this.j = arrayList6;
        this.d = arrayList7;
        this.a = arrayList8;
        this.c = arrayList9;
        this.h = arrayList10;
    }

    public final void a(android.net.Uri uri) {
        ((agsm) this.b).g(((rxa) this.h).b(uri), defpackage.hsi.a.toSeconds(), java.util.concurrent.TimeUnit.SECONDS);
    }

    public final kiu b(spn spnVar, kiu kiuVar) {
        akzx akzxVarAK = gus.aK(spnVar);
        kgz kgzVar = (kgz) ((zjm) this.e).g().orElse((java.lang.Object) null);
        if (kgzVar != null && kgzVar.b(kiuVar) != null) {
            akzxVarAK = kgz.e((defpackage.kiw) akzxVarAK.p()).p();
        }
        akzx akzxVarP = kiuVar.p();
        akzxVarP.u();
        kiu kiuVar2 = akzxVarP.b;
        defpackage.kiw kiwVar = (defpackage.kiw) akzxVarAK.p();
        j$.util.Objects.requireNonNull(kiwVar);
        kiuVar2.r = kiwVar;
        kiuVar2.b |= 16384;
        return akzxVarP.p();
    }

    public hsj(ajct ajctVar, ajct ajctVar2, sqo sqoVar, srv srvVar, aoin aoinVar, agsm agsmVar, rsr rsrVar, zjm zjmVar) {
        this.f = new aca();
        this.h = new java.util.LinkedHashMap();
        this.d = ajctVar;
        this.i = ajctVar2;
        this.a = sqoVar;
        this.b = srvVar;
        this.g = aoinVar;
        this.j = agsmVar;
        this.c = rsrVar;
        this.e = zjmVar;
    }

    public hsj(android.content.Context context, agsm agsmVar, com.android.dialer.app.calllog.CallLogNotificationsActivity callLogNotificationsActivity, aoin aoinVar, defpackage.hsm hsmVar, defpackage.hsr hsrVar, acxg acxgVar, rxa rxaVar, rwi rwiVar, gpd gpdVar) {
        this.a = context;
        this.b = agsmVar;
        this.c = callLogNotificationsActivity;
        this.d = aoinVar;
        this.e = hsmVar;
        this.f = hsrVar;
        this.g = acxgVar;
        this.h = rxaVar;
        this.i = rwiVar;
        this.j = gpdVar;
    }
}
