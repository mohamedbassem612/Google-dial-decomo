package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvo extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ abvp c;
    final /* synthetic */ android.net.Uri d;
    final /* synthetic */ defpackage.afaw e;
    final /* synthetic */ defpackage.abut f;
    final /* synthetic */ defpackage.amjp g;
    final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvo(abvp abvpVar, android.net.Uri uri, defpackage.afaw afawVar, defpackage.abut abutVar, defpackage.amjp amjpVar, java.lang.String str, aoln aolnVar) {
        super(2, aolnVar);
        this.c = abvpVar;
        this.d = uri;
        this.e = afawVar;
        this.f = abutVar;
        this.g = amjpVar;
        this.h = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:5:0x0009, B:16:0x0048, B:18:0x0056, B:19:0x005a), top: B:32:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005a A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:5:0x0009, B:16:0x0048, B:18:0x0056, B:19:0x005a), top: B:32:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable th;
        ?? r13;
        ?? r14;
        defpackage.abuf abufVarK;
        java.lang.Object abuiVar;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            java.lang.Object obj2 = this.a;
            try {
                aooc.af(obj);
                r14 = obj2;
                abufVarK = abts.k(((com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) obj).a.a);
                if (abufVarK == defpackage.abuf.l) {
                    abuiVar = defpackage.abun.a;
                } else {
                    abuiVar = new defpackage.abui(abufVarK, null);
                }
                ajsz.ak((java.io.Closeable) r14, (java.lang.Throwable) null);
                return abuiVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r13 = obj2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak((java.io.Closeable) r13, th);
                    throw th3;
                }
            }
        }
        aooc.af(obj);
        abvp abvpVar = this.c;
        if (!abvpVar.h()) {
            return new defpackage.abui(defpackage.abuf.n, null);
        }
        android.content.Context context = abvpVar.b;
        android.net.Uri uri = this.d;
        defpackage.afaw afawVar = this.e;
        defpackage.abut abutVar = this.f;
        defpackage.amjp amjpVar = this.g;
        java.lang.String str = this.h;
        android.os.ParcelFileDescriptor parcelFileDescriptorC = abrz.c(context, uri, afawVar);
        try {
            if (parcelFileDescriptorC == null) {
                throw new java.lang.IllegalStateException("Error while opening given fileUri.");
            }
            defpackage.abup abupVar = defpackage.abup.SELF;
            com.google.android.gms.people.cpg.callingcard.v2.Identifier identifierA = abutVar.a();
            this.a = parcelFileDescriptorC;
            this.b = 1;
            obj = abvpVar.d(abupVar, identifierA, parcelFileDescriptorC, uri, amjpVar, (java.lang.String) null, (java.lang.String) null, str, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            r14 = parcelFileDescriptorC;
            abufVarK = abts.k(((com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) obj).a.a);
            if (abufVarK == defpackage.abuf.l) {
                abuiVar = defpackage.abun.a;
            } else {
                abuiVar = new defpackage.abui(abufVarK, null);
            }
            ajsz.ak((java.io.Closeable) r14, (java.lang.Throwable) null);
            return abuiVar;
        } catch (java.lang.Throwable th4) {
            th = th4;
            r13 = parcelFileDescriptorC;
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abvo(this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
