package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gag extends defpackage.dzn {
    public final defpackage.gac a;
    public final java.util.List b;
    public final int c;
    public final int d;
    public final defpackage.gab e;
    public final defpackage.gab f = null;

    public gag(defpackage.gac gacVar, java.util.List list, int i, int i2, defpackage.gab gabVar) {
        this.a = gacVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = gabVar;
        if (gacVar != defpackage.gac.c && i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
        }
        if (gacVar != defpackage.gac.b && i2 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
        }
        if (gacVar == defpackage.gac.a && list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gag) {
            defpackage.gag gagVar = (defpackage.gag) obj;
            if (this.a == gagVar.a && defpackage.aooh.n(this.b, gagVar.b) && this.c == gagVar.c && this.d == gagVar.d && defpackage.aooh.n(this.e, gagVar.e)) {
                defpackage.gab gabVar = gagVar.f;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode()) * 31;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0086 -> B:18:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e0 -> B:23:0x00e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.dzn
    public final java.lang.Object l(defpackage.aonn r18, defpackage.aoln r19) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gag.l(aonn, aoln):java.lang.Object");
    }

    public final java.lang.String toString() {
        java.util.List list;
        java.util.List list2;
        java.util.List list3 = this.b;
        java.util.Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((defpackage.gdo) it.next()).b.size();
        }
        int i = this.c;
        java.lang.String strValueOf = i != -1 ? java.lang.String.valueOf(i) : "none";
        int i2 = this.d;
        java.lang.String strValueOf2 = i2 != -1 ? java.lang.String.valueOf(i2) : "none";
        defpackage.gac gacVar = this.a;
        defpackage.gdo gdoVar = (defpackage.gdo) defpackage.ajsz.bG(list3);
        java.lang.Object objBJ = null;
        java.lang.Object objBG = (gdoVar == null || (list2 = gdoVar.b) == null) ? null : defpackage.ajsz.bG(list2);
        defpackage.gdo gdoVar2 = (defpackage.gdo) defpackage.ajsz.bJ(list3);
        if (gdoVar2 != null && (list = gdoVar2.b) != null) {
            objBJ = defpackage.ajsz.bJ(list);
        }
        return defpackage.aoov.n(("PageEvent.Insert for " + gacVar + ", with " + size + " items (\n                    |   first item: " + objBG + "\n                    |   last item: " + objBJ + "\n                    |   placeholdersBefore: " + strValueOf + "\n                    |   placeholdersAfter: " + strValueOf2 + "\n                    |   sourceLoadStates: " + this.e + "\n                    ").concat("|)"));
    }
}
