package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkj {
    public final android.content.Context a;
    public final defpackage.bkm b;
    public android.view.textclassifier.TextClassifier c;
    private final aolr f;
    private final dnx g;
    public final apdp e = new apdp();
    private final ccp h = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
    public final java.lang.Object d = new java.lang.Object();

    public bkj(aolr aolrVar, android.content.Context context, defpackage.bkm bkmVar, dnx dnxVar) {
        this.f = aolrVar;
        this.a = context;
        this.b = bkmVar;
        this.g = dnxVar;
    }

    public final android.os.LocaleList a() {
        dnx dnxVar = this.g;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(dnxVar, 10));
        java.util.Iterator it = dnxVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((dnw) it.next()).a);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }

    public final defpackage.bmd b(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification) {
        android.graphics.drawable.Icon iconM;
        int size = ft$.ExternalSyntheticApiModelOutline0.m(textClassification).size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = ft$.ExternalSyntheticApiModelOutline0.m(textClassification).get(i);
            android.app.RemoteAction remoteActionM = aa$.ExternalSyntheticApiModelOutline0.m(obj);
            android.graphics.drawable.Drawable drawableLoadDrawable = null;
            if (i != 0 && !ft$.ExternalSyntheticApiModelOutline0.m(remoteActionM)) {
                obj = null;
            }
            android.app.RemoteAction remoteActionM2 = aa$.ExternalSyntheticApiModelOutline0.m(obj);
            if (remoteActionM2 != null && (iconM = aa$.ExternalSyntheticApiModelOutline0.m(remoteActionM2)) != null) {
                drawableLoadDrawable = iconM.loadDrawable(this.a);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new defpackage.bmd(charSequence, j, textClassification, arrayList);
    }

    public final defpackage.bmd c() {
        return (defpackage.bmd) this.h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [bkj] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.textclassifier.TextClassifier] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final java.lang.Object d(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassifier textClassifier, aoln aolnVar) {
        defpackage.bkf bkfVar;
        apdp apdpVar;
        ?? r9;
        ?? r6;
        defpackage.bmd bmdVar;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.bkf) {
            bkfVar = (defpackage.bkf) aolnVar;
            int i = bkfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkfVar.f = i - Integer.MIN_VALUE;
            } else {
                bkfVar = new defpackage.bkf(this, aolnVar);
            }
        } else {
            bkfVar = new defpackage.bkf(this, aolnVar);
        }
        java.lang.Object obj = bkfVar.d;
        aolu aoluVar = aolu.a;
        int i2 = bkfVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j = bkfVar.c;
                    apdp apdpVar3 = bkfVar.h;
                    java.lang.Object obj2 = bkfVar.b;
                    java.lang.Object obj3 = bkfVar.a;
                    aooc.af(obj);
                    apdpVar = apdpVar3;
                    r6 = obj3;
                    r9 = obj2;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = bkfVar.i;
                    bmdVar = bkfVar.g;
                    ft$.ExternalSyntheticApiModelOutline0.m(bkfVar.h);
                    aooc.af(obj);
                }
                try {
                    g(bmdVar);
                    return aojh.a;
                } finally {
                    apdpVar2.d();
                }
            }
            aooc.af(obj);
            apdpVar = this.e;
            bkfVar.a = charSequence;
            bkfVar.b = textClassifier;
            bkfVar.h = apdpVar;
            bkfVar.c = j;
            bkfVar.f = 1;
            if (apdpVar.b(bkfVar) == aoluVar) {
                r6 = charSequence;
                r9 = textClassifier;
                return aoluVar;
            }
            r6 = charSequence;
            r9 = textClassifier;
            defpackage.bmd bmdVarC = c();
            if (bmdVarC != null && defpackage.bkk.a(bmdVarC, r6, j)) {
                aojh aojhVar = aojh.a;
                apdpVar.d();
                return aojhVar;
            }
            apdpVar.d();
            defpackage.bmd bmdVarB = b(r6, j, ft$.ExternalSyntheticApiModelOutline0.m((android.view.textclassifier.TextClassifier) r9, ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.view.textclassifier.TextClassification.Request.Builder(r6, dky.c(j), dky.b(j)), a()))));
            apdp apdpVar4 = this.e;
            bkfVar.a = null;
            bkfVar.b = null;
            bkfVar.h = null;
            bkfVar.g = bmdVarB;
            bkfVar.i = apdpVar4;
            bkfVar.c = j;
            bkfVar.f = 2;
            if (apdpVar4.b(bkfVar) == aoluVar) {
                return aoluVar;
            }
            bmdVar = bmdVarB;
            apdpVar2 = apdpVar4;
            g(bmdVar);
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.lang.CharSequence charSequence, long j, aoln aolnVar) {
        defpackage.bkg bkgVar;
        if (aolnVar instanceof defpackage.bkg) {
            bkgVar = (defpackage.bkg) aolnVar;
            int i = bkgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkgVar.c = i - Integer.MIN_VALUE;
            } else {
                bkgVar = new defpackage.bkg(this, aolnVar);
            }
        } else {
            bkgVar = new defpackage.bkg(this, aolnVar);
        }
        java.lang.Object obj = bkgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = bkgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (((dji) charSequence).a() != 0 && !dky.f(j)) {
                defpackage.mbz mbzVar = new defpackage.mbz(this, charSequence, j, (aoln) null, 1);
                bkgVar.c = 1;
                if (f(mbzVar, bkgVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final java.lang.Object f(aonn aonnVar, aoln aolnVar) {
        return aoov.aj(this.f, new defpackage.kem(this, aonnVar, (aoln) null, 1), aolnVar);
    }

    public final void g(defpackage.bmd bmdVar) {
        this.h.b(bmdVar);
    }
}
