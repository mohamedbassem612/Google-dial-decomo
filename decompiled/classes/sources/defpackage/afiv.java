package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afiv implements android.app.Application.ActivityLifecycleCallbacks, defpackage.afis {
    private static final long g;
    public final java.util.concurrent.ScheduledExecutorService a;
    public java.util.concurrent.ScheduledFuture d;
    public defpackage.ajxw f;
    private final defpackage.afit h;
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(0);
    public final long b = g;
    protected final java.lang.Object e = new java.lang.Object();

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        g = 60000L;
    }

    private afiv(defpackage.ajxw ajxwVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.afit afitVar) {
        this.f = ajxwVar;
        this.a = scheduledExecutorService;
        this.h = afitVar;
    }

    public static defpackage.afiv c(defpackage.ajxw ajxwVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.afit afitVar, android.app.Application application) {
        defpackage.afiv afivVar = new defpackage.afiv(ajxwVar, scheduledExecutorService, afitVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(afivVar);
        }
        afitVar.c = afivVar;
        return afivVar;
    }

    public final void a() {
        synchronized (this.e) {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        int i;
        java.util.ArrayList arrayList;
        int i2;
        java.util.ArrayList arrayList2;
        int i3;
        int i4;
        this.c.set(0L);
        defpackage.ajxw ajxwVar = this.f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        defpackage.afit afitVar = this.h;
        synchronized (afitVar.b) {
            java.util.Iterator it = afitVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                defpackage.afir afirVar = (defpackage.afir) it.next();
                defpackage.afio[] afioVarArr = afirVar.c;
                java.util.HashMap map = new java.util.HashMap(afioVarArr.length > 0 ? 10 : 1);
                afiq afiqVar = new afiq(afirVar.b, afioVarArr);
                synchronized (afirVar.a) {
                    try {
                        afiqVar.d = afirVar.d;
                        afiqVar.a = afirVar.e;
                        afirVar.d = map;
                        afirVar.e = 0;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                arrayList3.add(afiqVar);
            }
        }
        defpackage.akzx akzxVarM = defpackage.ahwo.a.m();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            akdz akdzVarG = null;
            if (i5 >= size) {
                defpackage.ahwo ahwoVar = (defpackage.ahwo) akzxVarM.r();
                if (ahwoVar.b.size() != 0) {
                    akdzVarG = ((defpackage.zzd) ajxwVar.a).g(ahwoVar);
                    akdzVarG.j = (java.lang.String) ajxwVar.b;
                    java.util.Iterator it2 = ((java.util.concurrent.CopyOnWriteArrayList) ajxwVar.c).iterator();
                    while (it2.hasNext()) {
                        akdzVarG.h((java.lang.String) it2.next());
                    }
                }
                if (akdzVarG != null) {
                    akdzVarG.d();
                    return;
                }
                return;
            }
            afiq afiqVar2 = (afiq) arrayList3.get(i5);
            if (afiqVar2.a == 0) {
                arrayList = arrayList3;
                i2 = size;
            } else {
                defpackage.akzx akzxVarM2 = akdz.a.m();
                java.lang.String str = (java.lang.String) afiqVar2.b;
                long jB = defpackage.afit.b(str);
                akzxVarM2.u();
                akdz akdzVar = akzxVarM2.b;
                akdzVar.b |= 2;
                akdzVar.c = jB;
                defpackage.afio[] afioVarArr2 = (defpackage.afio[]) afiqVar2.c;
                int length = afioVarArr2.length;
                for (int i6 = i; i6 < length; i6++) {
                    long jB2 = defpackage.afit.b(afioVarArr2[i6].a);
                    akzxVarM2.u();
                    akdz akdzVar2 = akzxVarM2.b;
                    defpackage.alan alanVar = akdzVar2.d;
                    if (!alanVar.c()) {
                        akdzVar2.d = defpackage.alad.I(alanVar);
                    }
                    akdzVar2.d.g(jB2);
                }
                for (java.util.Map.Entry entry : afiqVar2.d.entrySet()) {
                    defpackage.akzx akzxVarM3 = akdy.a.m();
                    defpackage.afij afijVar = (defpackage.afij) entry.getKey();
                    defpackage.afik afikVar = (defpackage.afik) entry.getValue();
                    if (afioVarArr2.length > 0) {
                        java.lang.Object[] objArr = afijVar.c;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(objArr.length);
                        int i7 = 0;
                        while (i7 < objArr.length) {
                            defpackage.akzx akzxVarM4 = akdw.a.m();
                            java.lang.Object obj = objArr[i7];
                            java.util.ArrayList arrayList5 = arrayList3;
                            if (obj instanceof java.lang.String) {
                                java.lang.String str2 = (java.lang.String) obj;
                                akzxVarM4.u();
                                akdw akdwVar = akzxVarM4.b;
                                j$.util.Objects.requireNonNull(str2);
                                i4 = size;
                                akdwVar.b = 1;
                                akdwVar.c = str2;
                            } else {
                                i4 = size;
                                if (obj instanceof java.lang.Integer) {
                                    java.lang.Integer num = (java.lang.Integer) obj;
                                    num.intValue();
                                    akzxVarM4.u();
                                    akdw akdwVar2 = akzxVarM4.b;
                                    akdwVar2.b = 2;
                                    akdwVar2.c = num;
                                } else {
                                    if (!(obj instanceof java.lang.Boolean)) {
                                        throw new java.lang.IllegalArgumentException("Metric " + str + " has field " + i7 + " with an unexpected value: " + java.lang.String.valueOf(obj));
                                    }
                                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                                    bool.booleanValue();
                                    akzxVarM4.u();
                                    akdw akdwVar3 = akzxVarM4.b;
                                    akdwVar3.b = 3;
                                    akdwVar3.c = bool;
                                }
                            }
                            arrayList4.add(akzxVarM4.r());
                            i7++;
                            arrayList3 = arrayList5;
                            size = i4;
                        }
                        arrayList2 = arrayList3;
                        i3 = size;
                        akzxVarM3.u();
                        akdy akdyVar = akzxVarM3.b;
                        defpackage.alat alatVar = akdyVar.c;
                        if (!alatVar.c()) {
                            akdyVar.c = defpackage.alad.J(alatVar);
                        }
                        defpackage.akyl.i(arrayList4, akdyVar.c);
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                    }
                    akdx akdxVarA = afikVar.a();
                    akzxVarM3.u();
                    akdy akdyVar2 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(akdxVarA);
                    akdyVar2.d = akdxVarA;
                    akdyVar2.b |= 1;
                    akzxVarM2.u();
                    akdz akdzVar3 = akzxVarM2.b;
                    akdy akdyVarR = akzxVarM3.r();
                    j$.util.Objects.requireNonNull(akdyVarR);
                    defpackage.alat alatVar2 = akdzVar3.e;
                    if (!alatVar2.c()) {
                        akdzVar3.e = defpackage.alad.J(alatVar2);
                    }
                    akdzVar3.e.add(akdyVarR);
                    arrayList3 = arrayList2;
                    size = i3;
                }
                arrayList = arrayList3;
                i2 = size;
                akdzVarG = akzxVarM2.r();
            }
            if (akdzVarG != null) {
                akzxVarM.u();
                defpackage.ahwo ahwoVar2 = (defpackage.ahwo) akzxVarM.b;
                j$.util.Objects.requireNonNull(akdzVarG);
                defpackage.alat alatVar3 = ahwoVar2.b;
                if (!alatVar3.c()) {
                    ahwoVar2.b = defpackage.alad.J(alatVar3);
                }
                ahwoVar2.b.add(akdzVarG);
            }
            i5++;
            arrayList3 = arrayList;
            size = i2;
            i = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
