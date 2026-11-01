package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aceh extends aomh implements aonn {
    long a;
    java.lang.Object b;
    int c;
    final /* synthetic */ acem d;
    final /* synthetic */ akhj e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ akst g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aceh(acem acemVar, akhj akhjVar, java.lang.String str, akst akstVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = acemVar;
        this.e = akhjVar;
        this.f = str;
        this.g = akstVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0136  */
    /* JADX WARN: Code duplicated, block: B:31:0x0140  */
    /* JADX WARN: Code duplicated, block: B:39:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objC;
        long j;
        java.lang.Object obj2;
        java.lang.String strSubstring;
        long j2;
        java.lang.Object obj3;
        acem acemVar;
        akst akstVar;
        java.lang.String str;
        acal acalVar;
        akic akicVarY;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        akhq akhqVar;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                long j3 = this.a;
                aooc.af(obj);
                j = j3;
                objC = obj;
            } else {
                if (i != 2) {
                    java.lang.Object obj4 = this.b;
                    aooc.af(obj);
                    return obj4;
                }
                j2 = this.a;
                obj3 = this.b;
                aooc.af(obj);
            }
            j = j2;
            obj2 = obj3;
            acemVar = this.d;
            akstVar = this.g;
            str = this.f;
            if (obj2 instanceof adub) {
                akhn akhnVar = (akhn) ((adub) obj2).a;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
                amwu amwuVar = acemVar.d;
                aeey aeeyVar = (aeey) amwuVar.a();
                java.lang.String str2 = acemVar.c;
                ((afim) aeeyVar.k.eZ()).b(jElapsedRealtime, new java.lang.Object[]{str2, akstVar.name(), java.lang.Integer.valueOf(akhnVar.b.size())});
                ((aeey) amwuVar.a()).j(str2, "OK", akstVar.name());
                acalVar = acemVar.e;
                akicVarY = defpackage.abxl.y(akstVar);
                alat alatVar = akhnVar.b;
                aooh.e(alatVar, "getPromoList(...)");
                arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
                it = alatVar.iterator();
                while (it.hasNext()) {
                    akhqVar = ((akhl) it.next()).c;
                    if (akhqVar == null) {
                        akhqVar = akhq.a;
                    }
                    arrayList.add(java.lang.String.valueOf(akhqVar.b));
                }
                this.b = obj2;
                this.c = 3;
                if (acalVar.a(str, akicVarY, true, (java.lang.String) null, (java.lang.String) null, arrayList, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return obj2;
        }
        aooc.af(obj);
        acem acemVar2 = this.d;
        akhj akhjVar = this.e;
        java.lang.String str3 = this.f;
        akst akstVar2 = this.g;
        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime2;
        this.c = 1;
        objC = acemVar2.c(akhjVar, str3, akstVar2, this);
        if (objC == aoluVar) {
            return aoluVar;
        }
        j = jElapsedRealtime2;
        acem acemVar3 = this.d;
        akst akstVar3 = this.g;
        java.lang.String str4 = this.f;
        obj2 = (adtz) objC;
        if (obj2 instanceof adtv) {
            adtv adtvVar = (adtv) obj2;
            ((aeey) acemVar3.d.a()).j(acemVar3.c, "ERROR", akstVar3.name());
            hgb.b(acem.a.d(), "getPromos failed in the GrowthKitGnpApiWrapper", adtvVar.b());
            java.lang.String message = adtvVar.b().getMessage();
            if (message != null) {
                strSubstring = message.substring(0, java.lang.Math.min(message.length(), 200));
                aooh.e(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            java.lang.String str5 = strSubstring;
            acal acalVar2 = acemVar3.e;
            akic akicVarY2 = defpackage.abxl.y(akstVar3);
            java.lang.String simpleName = adtvVar.b().getClass().getSimpleName();
            aokc aokcVar = aokc.a;
            this.b = obj2;
            this.a = j;
            this.c = 2;
            if (acalVar2.a(str4, akicVarY2, false, simpleName, str5, aokcVar, this) == aoluVar) {
                return aoluVar;
            }
            j2 = j;
            obj3 = obj2;
            j = j2;
            obj2 = obj3;
        }
        acemVar = this.d;
        akstVar = this.g;
        str = this.f;
        if (obj2 instanceof adub) {
            akhn akhnVar2 = (akhn) ((adub) obj2).a;
            long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - j;
            amwu amwuVar2 = acemVar.d;
            aeey aeeyVar2 = (aeey) amwuVar2.a();
            java.lang.String str6 = acemVar.c;
            ((afim) aeeyVar2.k.eZ()).b(jElapsedRealtime3, new java.lang.Object[]{str6, akstVar.name(), java.lang.Integer.valueOf(akhnVar2.b.size())});
            ((aeey) amwuVar2.a()).j(str6, "OK", akstVar.name());
            acalVar = acemVar.e;
            akicVarY = defpackage.abxl.y(akstVar);
            alat alatVar2 = akhnVar2.b;
            aooh.e(alatVar2, "getPromoList(...)");
            arrayList = new java.util.ArrayList(ajsz.bl(alatVar2, 10));
            it = alatVar2.iterator();
            while (it.hasNext()) {
                akhqVar = ((akhl) it.next()).c;
                if (akhqVar == null) {
                    akhqVar = akhq.a;
                }
                arrayList.add(java.lang.String.valueOf(akhqVar.b));
            }
            this.b = obj2;
            this.c = 3;
            if (acalVar.a(str, akicVarY, true, (java.lang.String) null, (java.lang.String) null, arrayList, this) == aoluVar) {
                return aoluVar;
            }
        }
        return obj2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aceh(this.d, this.e, this.f, this.g, aolnVar);
    }
}
