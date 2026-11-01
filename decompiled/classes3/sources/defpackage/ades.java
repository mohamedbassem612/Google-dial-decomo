package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ades {
    public static final defpackage.ades a = new defpackage.ades();
    private static final aimz b = aimz.i("com/google/android/libraries/mdi/search/g3appsearch/app/util/G3AppSearchUtil");

    public static final pg b(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "namespace");
        aooh.f(str2, "id");
        return new pg(6, (java.lang.Object) null, "Document (" + str + ", " + str2 + ") not found.");
    }

    public static final pd c(px pxVar) {
        aooh.f(pxVar, "request");
        we weVar = new we((byte[]) null);
        for (java.lang.String str : pxVar.b()) {
            java.lang.String str2 = pxVar.a;
            aooh.e(str2, "getNamespace(...)");
            aooh.c(str);
            weVar.c(str, b(str2, str));
        }
        return weVar.a();
    }

    public final void a(qt qtVar) {
        aooh.f(qtVar, "searchSpec");
        if (j$.util.Collection.-EL.stream(qtVar.d().values()).anyMatch(new defpackage.abdh(new defpackage.acsb(11), 6))) {
            aify aifyVar = com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.a;
            aooh.e(aifyVar, "INDEXED_PROPERTY_PATH_LIST");
            throw new java.lang.IllegalArgumentException("The filter properties specified for each schema type in both outer and nested SearchSpecs must include all of ".concat(ajsz.cr(aifyVar, ", ", "[", "]", (aonj) null, 56)));
        }
        qe qeVar = qtVar.m;
        qt qtVar2 = qeVar != null ? qeVar.b : null;
        if (qtVar2 != null) {
            a(qtVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:15:0x004f->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:22:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(android.content.Context r10, java.util.Set r11, xtq r12, adde r13, aoln r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.adeq
            if (r0 == 0) goto L13
            r0 = r14
            adeq r0 = (defpackage.adeq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            adeq r0 = new adeq
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r9 = r0.c
            aolu r14 = aolu.a
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo r10 = r0.h
            java.lang.Object r11 = r0.b
            acc r12 = r0.g
            adde r13 = r0.f
            xtq r1 = r0.i
            java.lang.Object r3 = r0.a
            aooc.af(r9)
            r6 = r13
            r8 = r0
            r5 = r1
            goto L7b
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            aooc.af(r9)
            acc r9 = new acc
            r1 = 0
            r9.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
            r5 = r12
            r6 = r13
            r8 = r0
            r12 = r9
        L4f:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L88
            java.lang.Object r9 = r11.next()
            com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo r9 = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) r9
            akxp r7 = r9.e
            if (r7 == 0) goto L4f
            adeu r3 = adeu.a
            r8.a = r10
            r8.i = r5
            r8.f = r6
            r8.g = r12
            r8.b = r11
            r8.h = r9
            r8.e = r2
            r4 = r10
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r13 = r3.c(r4, r5, r6, r7, r8)
            if (r13 == r14) goto L89
            r3 = r10
            r10 = r9
            r9 = r13
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r12.add(r10)
        L86:
            r10 = r3
            goto L4f
        L88:
            r14 = r12
        L89:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ades.d(android.content.Context, java.util.Set, xtq, adde, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(android.content.Context context, java.lang.String str, java.util.Set set, xtq xtqVar, adde addeVar, boolean z, aoln aolnVar) {
        defpackage.ader aderVar;
        if (aolnVar instanceof defpackage.ader) {
            aderVar = (defpackage.ader) aolnVar;
            int i = aderVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aderVar.d = i - Integer.MIN_VALUE;
            } else {
                aderVar = new defpackage.ader(this, aolnVar);
            }
        } else {
            aderVar = new defpackage.ader(this, aolnVar);
        }
        defpackage.ader aderVar2 = aderVar;
        java.lang.Object objD = aderVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = aderVar2.d;
        if (i2 == 0) {
            aooc.af(objD);
            aderVar2.e = str;
            aderVar2.a = z;
            aderVar2.d = 1;
            objD = d(context, set, xtqVar, addeVar, aderVar2);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = aderVar2.a;
            str = aderVar2.e;
            aooc.af(objD);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo : (java.util.Set) objD) {
            java.lang.String str2 = g3AttributionInfo.d;
            if (str2 == null || str2.length() <= 0) {
                java.lang.String str3 = g3AttributionInfo.c;
                if (str3 != null && str3.length() > 0) {
                    arrayList.add(str3);
                }
            } else {
                arrayList2.add(str2);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str.length() > 0) {
            sb.append("(" + str + ") ");
        }
        sb.append("(NOT propertyDefined(\"g3attrinfo\")");
        if (!arrayList.isEmpty()) {
            sb.append(ajsz.cr(arrayList, " OR ", " OR g3attrinfo.normal:(", ")", new defpackage.acsb(12), 24));
        }
        if (!arrayList2.isEmpty()) {
            sb.append(ajsz.cr(arrayList2, " OR ", " OR g3attrinfo.tokenid:(", ")", new defpackage.acsb(13), 24));
        }
        if (z) {
            sb.append(") (NOT propertyDefined(\"g3tsattrinfo\"))");
        } else {
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x010b -> B:77:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0179 -> B:94:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01fc -> B:76:0x0242). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(android.content.Context r21, pd r22, adde r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, defpackage.vqy r28, defpackage.vaa r29, java.util.Map r30, xtq r31, aoln r32) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ades.f(android.content.Context, pd, adde, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vqy, vaa, java.util.Map, xtq, aoln):java.lang.Object");
    }
}
