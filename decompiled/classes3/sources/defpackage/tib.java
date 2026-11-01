package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tib {
    public static final aimz a = aimz.i("com/android/dialer/searchfragment/contactretriever/impl/Cp2PhoneEntryListRetriever");
    private static final android.net.Uri f = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI.buildUpon().appendQueryParameter("remove_duplicate_entries", "true").build();
    public final ajct b;
    public final aoin c;
    public final nxg d;
    public final zjm e;
    private final ajct g;
    private final ojo h;

    public tib(ajct ajctVar, ajct ajctVar2, ojo ojoVar, zjm zjmVar, aoin aoinVar, nxg nxgVar) {
        this.b = ajctVar;
        this.g = ajctVar2;
        this.h = ojoVar;
        this.e = zjmVar;
        this.c = aoinVar;
        this.d = nxgVar;
    }

    public final ajcq a(java.util.Collection collection) {
        java.util.List arrayList;
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            arrayList = new java.util.ArrayList(collection.size());
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((java.lang.Long) it.next()).toString());
            }
        } else {
            arrayList = (java.util.List) j$.util.Collection.-EL.stream(collection).map(new defpackage.thw(3)).collect(j$.util.stream.Collectors.toCollection(new defpackage.rqc(5)));
        }
        java.lang.Iterable<java.util.List> iterableBf = ahvr.bf(arrayList, 999);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.List list : iterableBf) {
            aca acaVar = new aca();
            rsr rsrVar = new rsr();
            rsrVar.aC(new kaw("data1").aH("IS NOT NULL"));
            rsrVar.aC(new kaw("contact_id").aF(list));
            rsr rsrVarAB = rsrVar.aB();
            ojo ojoVar = this.h;
            java.lang.Object obj = rsrVarAB.b;
            java.lang.String str = (java.lang.String) obj;
            arrayList2.add(ojoVar.d(f, defpackage.thq.b(), str, (java.lang.String[]) rsrVarAB.a, (java.lang.String) null).c(ahqx.e(new defpackage.vdh(acaVar, 1)), this.g).h());
        }
        ahda ahdaVarAj = ahvr.aj(arrayList2);
        defpackage.sws swsVar = new defpackage.sws(arrayList2, 19);
        ajct ajctVar = this.b;
        return ahrv.g(ahdaVarAj.o(swsVar, ajctVar)).i(new defpackage.tct(this, 7), ajctVar).i(new defpackage.tct(this, 8), ajctVar);
    }
}
