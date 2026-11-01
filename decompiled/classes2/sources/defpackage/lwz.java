package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lwz extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ tej c;
    final /* synthetic */ defpackage.lxa d;
    final /* synthetic */ tin e;
    final /* synthetic */ java.lang.Long f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwz(tej tejVar, defpackage.lxa lxaVar, tin tinVar, java.lang.Long l, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.c = tejVar;
        this.d = lxaVar;
        this.e = tinVar;
        this.f = l;
        this.g = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objA;
        java.lang.Object obj2;
        android.net.Uri lookupUri;
        java.lang.String str;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            java.lang.Object obj3 = this.a;
            aooc.af(obj);
            objA = obj;
            obj2 = obj3;
        } else {
            aooc.af(obj);
            tej tejVar = this.c;
            defpackage.lxa lxaVar = this.d;
            java.lang.String str2 = tejVar.a;
            this.a = str2;
            this.b = 1;
            objA = lxaVar.f.a(this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj2 = str2;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        tin tinVar = this.e;
        java.lang.String string = tinVar.d;
        java.lang.String str3 = string == null ? "" : string;
        java.lang.String str4 = tinVar.j;
        java.lang.String str5 = str4 == null ? "" : str4;
        defpackage.lxa lxaVar2 = this.d;
        if (!((java.lang.Boolean) lxaVar2.e.a()).booleanValue() || (str = tinVar.s) == null || str.length() == 0) {
            java.lang.Long l = this.f;
            lookupUri = l == null ? android.provider.ContactsContract.Contacts.getLookupUri(tinVar.l, str5) : android.net.Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, str5).buildUpon().appendQueryParameter("directory", java.lang.String.valueOf(l.longValue())).build();
        } else {
            lookupUri = android.net.Uri.parse(str);
            aooh.e(lookupUri, "parse(...)");
        }
        android.net.Uri uri = lookupUri;
        android.content.Context context = lxaVar2.b;
        aooh.f(tinVar, "<this>");
        aooh.f(context, "context");
        aooh.f(obj2, "query");
        java.lang.String strA = tinVar.a(context);
        if (strA == null) {
            strA = "";
        }
        java.lang.String str6 = (java.lang.String) obj2;
        java.lang.CharSequence charSequenceAq = pez.aq(context, tiq.a(str6, strA, context));
        aooh.e(charSequenceAq, "format(...)");
        dji djiVarCa = mni.ca(charSequenceAq);
        aooh.f(tinVar, "<this>");
        aooh.f(context, "context");
        aooh.f(obj2, "query");
        java.lang.String str7 = string == null ? "" : string;
        aooh.f(tinVar, "<this>");
        aooh.f(context, "context");
        java.lang.String strBF = mni.bF(tinVar, context);
        if (string == null) {
            string = "";
        }
        int i = 0;
        if (strBF.length() != 0) {
            string = context.getString(2132017873, strBF, string);
            aooh.c(string);
        }
        defpackage.djf djfVar = new defpackage.djf(16);
        if (str7.length() > 0) {
            java.lang.CharSequence charSequenceAq2 = pez.aq(context, tiq.c(str6, string, context));
            aooh.c(charSequenceAq2);
            djfVar.f(mni.ca(charSequenceAq2));
        }
        j$.util.Optional optional = tinVar.o;
        defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.aju(tinVar, djfVar, obj2, context, 11, null), i);
        if (true == optional.isPresent()) {
            lwxVar.a.a(optional.get());
        }
        dji djiVarC = djfVar.c();
        aooh.f(tinVar, "<this>");
        aooh.f(context, "context");
        java.lang.String strA2 = tinVar.a(context);
        java.lang.String str8 = strA2 != null ? strA2 : "";
        java.lang.String strBF2 = mni.bF(tinVar, context);
        vaa vaaVarD = abxl.D(abvz.a.m());
        java.lang.String strC = defpackage.dxt.a().c(str8);
        aooh.e(strC, "unicodeWrap(...)");
        vaaVarD.U(strC);
        vaaVarD.T(strBF2);
        java.lang.String str9 = tinVar.i;
        if (str9 != null) {
            vaaVarD.V(str9);
        }
        abvz abvzVarS = vaaVarD.S();
        int i2 = tinVar.k;
        defpackage.nwx nwxVar = tinVar.r;
        aooh.e(nwxVar, "getMeetReachability(...)");
        java.lang.Long l2 = this.f;
        if (l2 != null && sns.e(l2.longValue())) {
            i = 1;
        }
        int i3 = this.g;
        tej tejVar2 = this.c;
        return new tfn(new tfk(djiVarCa, djiVarC, str5, zBooleanValue, abvzVarS, new tfj(str3, 0, str6, i3, tejVar2.c, tejVar2.b), str9, uri, i2, nwxVar, i), tfo.a);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lwz(this.c, this.d, this.e, this.f, this.g, aolnVar);
    }
}
