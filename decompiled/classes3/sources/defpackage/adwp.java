package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwp implements defpackage.advt {
    private static final aiof a = aiof.i("GnpSdk");
    private final aeee b;
    private final adym c;

    public adwp(aeee aeeeVar, adym adymVar) {
        aooh.f(aeeeVar, "gnpAccountStorage");
        aooh.f(adymVar, "gnpAuthManager");
        this.b = aeeeVar;
        this.c = adymVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r4.b == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (r4.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r4.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        r4 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        r4 = defpackage.aktl.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r4 = defpackage.akte.b(r4.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r4 = defpackage.akte.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r4 != defpackage.akte.IN_APP) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return defpackage.adwl.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return defpackage.adwl.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r4.length() != 0) goto L49;
     */
    @Override // defpackage.advt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.adwl a(defpackage.aksh r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lae
            int r4 = r5.b
            r0 = r4 & 4
            if (r0 == 0) goto L1d
            aksx r4 = r5.e
            if (r4 != 0) goto Le
            aksx r4 = aksx.a
        Le:
            java.lang.String r4 = r4.e
            java.lang.String r5 = "getIdentifier(...)"
            aooh.e(r4, r5)
            int r4 = r4.length()
            if (r4 == 0) goto Lae
            goto Lab
        L1d:
            r4 = r4 & 8
            if (r4 == 0) goto Lae
            aktl r4 = r5.f
            if (r4 != 0) goto L27
            aktl r4 = defpackage.aktl.a
        L27:
            int r4 = r4.b
            aktk r4 = defpackage.aktk.b(r4)
            if (r4 != 0) goto L31
            aktk r4 = defpackage.aktk.UNKNOWN_INSTRUCTION
        L31:
            r0 = 5
            aktk[] r0 = new defpackage.aktk[r0]
            r1 = 0
            aktk r2 = defpackage.aktk.SYNC
            r0[r1] = r2
            r1 = 1
            aktk r2 = defpackage.aktk.FULL_SYNC
            r0[r1] = r2
            aktk r1 = defpackage.aktk.STORE_ALL_ACCOUNTS
            r2 = 2
            r0[r2] = r1
            r2 = 3
            aktk r3 = defpackage.aktk.UPDATE_THREAD
            r0[r2] = r3
            aktk r2 = defpackage.aktk.UPDATE_BADGE_COUNT
            r3 = 4
            r0[r3] = r2
            java.util.List r0 = ajsz.bb(r0)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lae
            if (r4 != r2) goto L68
            aktf r4 = r5.g
            if (r4 != 0) goto L5f
            aktf r4 = defpackage.aktf.a
        L5f:
            long r4 = r4.b
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto Lab
            goto Lae
        L68:
            if (r4 == r1) goto Lab
            boolean r4 = defpackage.angl.c()
            if (r4 == 0) goto L84
            akth r4 = r5.d
            if (r4 != 0) goto L76
            akth r4 = defpackage.akth.a
        L76:
            java.lang.String r4 = r4.d
            java.lang.String r0 = "getRepresentativeTargetId(...)"
            aooh.e(r4, r0)
            int r4 = r4.length()
            if (r4 == 0) goto Lae
            goto L91
        L84:
            java.lang.String r4 = r5.c
            java.lang.String r0 = "getRecipientOid(...)"
            aooh.e(r4, r0)
            int r4 = r4.length()
            if (r4 == 0) goto Lae
        L91:
            aktl r4 = r5.f
            if (r4 != 0) goto L97
            aktl r4 = defpackage.aktl.a
        L97:
            int r4 = r4.c
            akte r4 = defpackage.akte.b(r4)
            if (r4 != 0) goto La1
            akte r4 = defpackage.akte.UNKNOWN
        La1:
            akte r5 = defpackage.akte.IN_APP
            if (r4 != r5) goto La8
            adwl r4 = defpackage.adwl.c
            goto Lb0
        La8:
            adwl r4 = defpackage.adwl.b
            goto Lb0
        Lab:
            adwl r4 = defpackage.adwl.b
            goto Lb0
        Lae:
            adwl r4 = defpackage.adwl.a
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwp.a(aksh):adwl");
    }

    @Override // defpackage.advt
    public final java.lang.Object b(defpackage.aksh akshVar, aoln aolnVar) {
        if (akshVar == null) {
            return new defpackage.adtw("Payload is null, can't get recipient account", adty.aL);
        }
        return defpackage.angl.c() ? d(akshVar, aolnVar) : c(akshVar, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158 A[LOOP:0: B:60:0x0152->B:62:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c1 -> B:55:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c7 -> B:55:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0109 -> B:49:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0131 -> B:53:0x012f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:59:0x0143
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.aksh r11, aoln r12) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwp.c(aksh, aoln):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aksh akshVar, aoln aolnVar) throws aois {
        defpackage.adwn adwnVar;
        java.lang.String str;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.adwn) {
            adwnVar = (defpackage.adwn) aolnVar;
            int i = adwnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwnVar.c = i - Integer.MIN_VALUE;
            } else {
                adwnVar = new defpackage.adwn(this, aolnVar);
            }
        } else {
            adwnVar = new defpackage.adwn(this, aolnVar);
        }
        java.lang.Object objC = adwnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwnVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            if ((akshVar.b & 2) != 0) {
                defpackage.akth akthVar = akshVar.d;
                if (akthVar == null) {
                    akthVar = defpackage.akth.a;
                }
                str = akthVar.d;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                a.c().v("Representative target id in payload is empty, can't find account");
                return new defpackage.adtw("Payload does not contain an RTID", adty.aM);
            }
            aeee aeeeVar = this.b;
            adwnVar.d = str;
            adwnVar.c = 1;
            objC = aeeeVar.c(adwnVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = adwnVar.d;
            aooc.af(objC);
        }
        adtv adtvVar = (adtz) objC;
        int iR = anty.R(adtvVar);
        if (iR != 0) {
            if (iR != 1) {
                throw new aois();
            }
            adtv adtvVar2 = adtvVar;
            hgb.b(a.d(), "Failed to fetch accounts from storage.", adtvVar2.b());
            return adtvVar2;
        }
        for (aduy aduyVar : (java.util.List) ((adub) adtvVar).a) {
            if (aooh.n(aduyVar.i, str2)) {
                return new adub(aduyVar);
            }
        }
        return new defpackage.adtw("An account with the requested RTID was not found in storage", adty.X);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aduy aduyVar, aoln aolnVar) {
        defpackage.adwo adwoVar;
        if (aolnVar instanceof defpackage.adwo) {
            adwoVar = (defpackage.adwo) aolnVar;
            int i = adwoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwoVar.c = i - Integer.MIN_VALUE;
            } else {
                adwoVar = new defpackage.adwo(this, aolnVar);
            }
        } else {
            adwoVar = new defpackage.adwo(this, aolnVar);
        }
        java.lang.Object objA = adwoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwoVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            java.lang.String str = aduyVar.b;
            adym adymVar = this.c;
            aooh.c(str);
            adwoVar.d = aduyVar;
            adwoVar.c = 1;
            objA = adymVar.a(str, adwoVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aduyVar = adwoVar.d;
            aooc.af(objA);
        }
        adtz adtzVar = (adtz) objA;
        if (adtzVar.g()) {
            a.c().k(adtzVar.f()).x("Failed to get the obfuscated account ID for account with ID [%s].", aduyVar.a);
            return null;
        }
        java.lang.String str2 = (java.lang.String) adtzVar.d();
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        a.c().x("AuthUtil returned empty obfuscated account ID for account with ID [%s].", aduyVar.a);
        return null;
    }
}
