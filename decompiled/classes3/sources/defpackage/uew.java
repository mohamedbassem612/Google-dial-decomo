package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uew implements ajat {
    public final /* synthetic */ uex a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ uew(uex uexVar, java.lang.String str, java.lang.String str2) {
        this.a = uexVar;
        this.b = str;
        this.c = str2;
    }

    public final ajcq a(java.lang.Object obj) {
        udm udmVarP;
        udm udmVar;
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (optional.isPresent()) {
            return aiql.z((defpackage.ufi) optional.orElse(defpackage.ufi.d()));
        }
        java.lang.String str = this.c;
        java.lang.String str2 = this.b;
        uex uexVar = this.a;
        ugs ugsVar = uexVar.g;
        defpackage.uim uimVarAt = uexVar.i.at(str2, str);
        ahrv ahrvVarI = ahrv.g(ugsVar.a(defpackage.ugv.a)).i(new defpackage.tak(uexVar, str2, 19, null), uexVar.e);
        ubc ubcVar = new ubc(13);
        ajct ajctVar = uexVar.d;
        ahrv ahrvVarE = ahrvVarI.h(ubcVar, ajctVar).e(java.lang.IllegalStateException.class, new ubc(14), ajctVar).e(java.lang.Throwable.class, new defpackage.uev(uexVar, 2), ajctVar);
        android.database.Cursor cursorA = uexVar.a(new aile(str2));
        try {
            if (cursorA == null) {
                uex.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserSpamListStatusForNormalizedNumber", 244, "SpamDatabaseUtils.java").v("null cursor returned");
                udmVar = defpackage.udn.a;
            } else {
                if (cursorA.moveToFirst()) {
                    int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("spam_status");
                    int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("created");
                    int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("client_meta_data");
                    int i = cursorA.getInt(columnIndexOrThrow);
                    defpackage.uei ueiVar = defpackage.uei.a;
                    try {
                        if (cursorA.getBlob(columnIndexOrThrow3) != null) {
                            ueiVar = (defpackage.uei) alad.B(ueiVar, cursorA.getBlob(columnIndexOrThrow3), akzq.a());
                        }
                    } catch (alaz e) {
                        uex.a.d().k(e).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserSpamListStatusForNormalizedNumber", 267, "SpamDatabaseUtils.java").v("Invalid ClientMetaData protobuf.");
                    }
                    ahvr.bY(!cursorA.isNull(columnIndexOrThrow2));
                    long j = cursorA.getLong(columnIndexOrThrow2);
                    akzx akzxVarM = udm.a.m();
                    udj udjVarB = uex.b(i);
                    akzxVarM.u();
                    udm udmVar2 = akzxVarM.b;
                    udmVar2.d = udjVarB.f;
                    udmVar2.b |= 2;
                    akzxVarM.u();
                    udm udmVar3 = akzxVarM.b;
                    udmVar3.b |= 1;
                    udmVar3.c = j;
                    int iAR = a.aR(ueiVar.c);
                    if (iAR == 0) {
                        iAR = 1;
                    }
                    int iE = uex.e(iAR);
                    akzxVarM.u();
                    udm udmVar4 = akzxVarM.b;
                    udmVar4.i = iE - 1;
                    udmVar4.b |= 128;
                    int iAR2 = a.aR(ueiVar.d);
                    int iE2 = uex.e(iAR2 != 0 ? iAR2 : 1);
                    akzxVarM.u();
                    udm udmVar5 = akzxVarM.b;
                    udmVar5.j = iE2 - 1;
                    udmVar5.b |= 256;
                    udmVarP = akzxVarM.p();
                } else {
                    udmVarP = defpackage.udn.a;
                }
                cursorA.close();
                udmVar = udmVarP;
            }
            return ahvr.H(ahrvVarE, new lda(uexVar, uimVarAt, udmVar, str2, 5), uexVar.d);
        } catch (java.lang.Throwable th) {
            if (cursorA == null) {
                throw th;
            }
            try {
                cursorA.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
