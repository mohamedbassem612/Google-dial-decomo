package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvm extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ abvp c;
    final /* synthetic */ android.net.Uri d;
    final /* synthetic */ defpackage.afaw e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ defpackage.amjp g;
    final /* synthetic */ java.lang.String h;
    final /* synthetic */ java.lang.String i;
    final /* synthetic */ java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvm(abvp abvpVar, android.net.Uri uri, defpackage.afaw afawVar, java.lang.String str, defpackage.amjp amjpVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, aoln aolnVar) {
        super(2, aolnVar);
        this.c = abvpVar;
        this.d = uri;
        this.e = afawVar;
        this.f = str;
        this.g = amjpVar;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x0009, B:16:0x0055, B:18:0x0063, B:19:0x0067), top: B:32:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x0009, B:16:0x0055, B:18:0x0063, B:19:0x0067), top: B:32:0x0009 }] */
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
                    abuiVar = defpackage.abum.a;
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
        if (!abvpVar.f()) {
            return new defpackage.abui(defpackage.abuf.n, null);
        }
        android.content.Context context = abvpVar.b;
        android.net.Uri uri = this.d;
        defpackage.afaw afawVar = this.e;
        java.lang.String str = this.f;
        defpackage.amjp amjpVar = this.g;
        java.lang.String str2 = this.h;
        java.lang.String str3 = this.i;
        java.lang.String str4 = this.j;
        android.os.ParcelFileDescriptor parcelFileDescriptorC = abrz.c(context, uri, afawVar);
        try {
            if (parcelFileDescriptorC == null) {
                throw new java.lang.IllegalStateException("Error while opening given fileUri.");
            }
            defpackage.abup abupVar = defpackage.abup.MCC;
            defpackage.aarq aarqVar = new defpackage.aarq();
            aarqVar.b(2);
            aarqVar.b = str;
            com.google.android.gms.people.cpg.callingcard.v2.Identifier identifierA = aarqVar.a();
            this.a = parcelFileDescriptorC;
            this.b = 1;
            obj = abvpVar.d(abupVar, identifierA, parcelFileDescriptorC, uri, amjpVar, str2, str3, str4, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            r14 = parcelFileDescriptorC;
            abufVarK = abts.k(((com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) obj).a.a);
            if (abufVarK == defpackage.abuf.l) {
                abuiVar = defpackage.abum.a;
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
        return new defpackage.abvm(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aolnVar);
    }
}
