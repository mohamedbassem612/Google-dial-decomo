package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aljf {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aljf(aogc aogcVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(aogcVar, "streamzFields");
        aooh.f(aoinVar, "streamzProvider");
        aooh.f(aoinVar2, "enableAuthStreamzProvider");
        aooh.f(aoinVar3, "enableTransportLoadStreamzProvider");
        this.a = aogcVar;
        this.b = aooc.ag(new ahca(aoinVar, 3));
        this.d = aooc.ag(new ahca(aoinVar2, 4));
        this.c = aooc.ag(new ahca(aoinVar3, 5));
    }

    public static final afbf f(android.content.Intent intent, defpackage.afbe afbeVar) {
        java.lang.Object obj;
        defpackage.afmm afmmVar = new defpackage.afmm();
        afmmVar.a(aikn.a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        defpackage.akwb akwbVar = (defpackage.akwb) afbeVar.b.getOrDefault(intent.getAction(), afbeVar.c);
        android.content.Intent intent2 = new android.content.Intent(intent);
        if (!akwbVar.b && intent.getData() != null) {
            defpackage.afcd.c("_DATA", arrayList, hashSet);
            intent2.setData(null);
        }
        if (intent.getClipData() != null) {
            defpackage.afcd.c("_CLIP_DATA", arrayList, hashSet);
            intent2.setClipData(null);
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            java.lang.Object obj2 = akwbVar.a;
            android.os.Bundle bundle = new android.os.Bundle();
            afbc afbcVar = (afbc) obj2;
            aihd aihdVar = afbcVar.c;
            if (!aihdVar.isEmpty()) {
                bundle.putAll(extras);
                for (java.lang.String str : extras.keySet()) {
                    if (!aihdVar.contains(str)) {
                        bundle.remove(str);
                    }
                }
            }
            ailj ailjVarC = ahvr.am(extras.keySet(), aihdVar).c();
            while (ailjVarC.hasNext()) {
                java.lang.String str2 = (java.lang.String) ailjVarC.next();
                if (((defpackage.afcd) afbcVar.b.get(str2)) == null) {
                    defpackage.afcd.c(str2, arrayList, hashSet);
                } else {
                    arrayList.add(str2);
                    bundle.putBoolean(str2, extras.getBoolean(str2));
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            intent2.replaceExtras(bundle);
        }
        if (intent.getSelector() != null) {
            defpackage.afcd.c("_SELECTOR", arrayList, hashSet);
            intent2.setSelector(null);
        }
        afmmVar.b = intent2;
        afmmVar.a(aihd.o(hashSet));
        java.lang.Object obj3 = afmmVar.b;
        if (obj3 != null && (obj = afmmVar.a) != null) {
            return new afbf((android.content.Intent) obj3, (aihd) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (afmmVar.b == null) {
            sb.append(" intent");
        }
        if (afmmVar.a == null) {
            sb.append(" removedExtras");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    static void g(defpackage.aelt aeltVar, android.view.View view) {
        if (view instanceof aelw) {
            ((aelw) view).b(aeltVar);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                g(aeltVar, viewGroup.getChildAt(i));
            }
        }
    }

    static void h(defpackage.aelt aeltVar, android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                h(aeltVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof aelw) {
            ((aelw) view).d(aeltVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aizr, java.lang.Object] */
    public final alje a(alqh alqhVar, defpackage.amba ambaVar, alip alipVar, java.lang.String str) {
        aljg aljgVar = (aljg) this.c.get(ambaVar);
        ?? r0 = this.b;
        return new alje(aljgVar, str, amgt.a(alipVar), (aizr) this.a, (alud) r0.get(ambaVar), alqhVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final defpackage.ahix b() {
        return (defpackage.ahix) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final boolean c() {
        return ((java.lang.Boolean) this.d.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((afip) this.b.eZ()).b(1L, new java.lang.Object[]{str, str2, str3, str4});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void e(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((afim) this.c.eZ()).b(d, new java.lang.Object[]{str, str2, str3, str4});
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aelt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aehm, java.lang.Object] */
    public final void i(android.view.View view, java.lang.Object obj) {
        defpackage.aelm aelmVar;
        if (obj == null) {
            aelmVar = new defpackage.aelm(2, null);
        } else {
            ?? r2 = this.a;
            if (r2.g(obj)) {
                java.lang.String strC = r2.c(obj);
                aelmVar = (strC == null || !strC.contains("@")) ? new defpackage.aelm(2, null) : new defpackage.aelm(1, strC);
            } else {
                aelmVar = new defpackage.aelm(3, null);
            }
        }
        defpackage.aelm aelmVar2 = (defpackage.aelm) view.getTag(2131429430);
        if (aelmVar.equals(aelmVar2)) {
            return;
        }
        if (aelmVar2 == null) {
            ((defpackage.aelu) this.b).a(view, aelmVar);
            view.setTag(2131429430, aelmVar);
            return;
        }
        int i = dzs.a;
        if (view.isAttachedToWindow()) {
            ?? r1 = this.c;
            h(r1, view);
            defpackage.aelu aeluVar = (defpackage.aelu) this.b;
            ((defpackage.aelv) aeluVar.b).c(view);
            aeluVar.a(view, aelmVar);
            g(r1, view);
            view.setTag(2131429430, aelmVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void j(java.lang.String str) {
        aooh.f(str, "packageName");
        if (this.a.add(str)) {
            this.d.remove(str);
            this.b.add(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final int k(java.lang.String str) {
        aooh.f(str, "packageName");
        if (this.d.contains(str)) {
            return 1;
        }
        if (this.a.contains(str)) {
            return 2;
        }
        return this.c.contains(str) ? 3 : 4;
    }

    public final android.content.Context l() {
        android.content.Context context = ((android.view.View) this.d).getContext();
        aooh.e(context, "getContext(...)");
        return context;
    }

    public aljf(defpackage.aelt aeltVar, defpackage.aelu aeluVar, defpackage.aehm aehmVar, defpackage.aeit aeitVar) {
        this.c = aeltVar;
        this.b = aeluVar;
        this.a = aehmVar;
        this.d = aeitVar;
    }

    public aljf(android.content.Context context, ajcu ajcuVar, ucm ucmVar, apjb apjbVar) {
        this.a = context;
        this.b = ajcuVar;
        this.d = ucmVar;
        this.c = apjbVar;
    }

    public aljf(anpk anpkVar, anmb anmbVar, anph anphVar, java.lang.String str) {
        this.a = anmbVar;
        this.c = anpkVar;
        this.d = anphVar;
        this.b = str;
    }

    public aljf(java.lang.String str, aigf aigfVar, defpackage.afbe afbeVar, defpackage.afbe afbeVar2) {
        this.c = str;
        this.b = aigfVar;
        this.d = afbeVar;
        this.a = afbeVar2;
    }

    public aljf(java.util.Map map, java.util.Map map2) {
        this.a = aizq.a;
        this.d = new aknx();
        this.b = map;
        this.c = map2;
    }

    public aljf(ahgd ahgdVar, defpackage.rai raiVar) {
        this.b = new java.lang.Object();
        this.c = new java.util.HashMap();
        this.d = ahgdVar;
        this.a = raiVar;
    }

    public aljf(android.view.View view) {
        aooh.f(view, "root");
        this.d = view;
        android.view.View viewFindViewById = view.findViewById(2131428128);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
        this.c = imageView;
        android.view.View viewFindViewById2 = view.findViewById(2131428130);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.b = (android.widget.TextView) viewFindViewById2;
        this.a = imageView.getImageTintList();
    }

    public aljf(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.d = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
        aoinVar4.getClass();
        this.c = aoinVar4;
    }

    public aljf(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajxw ajxwVar, android.app.Application application) {
        this.b = ahvr.bI(new defpackage.ahiw(this, 15));
        this.c = ahvr.bI(new defpackage.ahiw(this, 16));
        afit afitVarD = afit.d("tiktok");
        this.d = afitVarD;
        afiv afivVar = afitVarD.c;
        if (afivVar == null) {
            this.a = afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.a = afivVar;
            afivVar.f = ajxwVar;
        }
    }

    public aljf() {
        this.b = new acc(0);
        this.d = new acc(0);
        this.a = new acc(0);
        this.c = new acc(0);
    }
}
