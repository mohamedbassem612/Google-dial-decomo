package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aany extends aada implements aanj {
    public static final acxg a;
    static final aais l;

    static {
        aais aaisVar = new aais();
        l = aaisVar;
        a = new acxg("LocationServices.API", new defpackage.aanw(), aaisVar);
    }

    public aany(android.content.Context context) {
        super(context, (android.app.Activity) null, a, aacu.q, aacz.a);
    }

    public final aaum a(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, defpackage.aano aanoVar) {
        aais.at(aanoVar, "Listener must not be null");
        aais.at(executor, "Executor must not be null");
        aais.at("aano", "Listener type must not be null");
        aafe aafeVar = new aafe(executor, aanoVar, "aano");
        defpackage.aanx aanxVar = new defpackage.aanx(this, aafeVar);
        defpackage.zxc zxcVar = new defpackage.zxc(aanxVar, locationRequest, 9);
        aafl aaflVar = new aafl();
        aaflVar.a = zxcVar;
        aaflVar.b = aanxVar;
        aaflVar.c = aafeVar;
        aaflVar.f = 2435;
        return l(aaflVar.a());
    }

    public final void b(defpackage.aano aanoVar) {
        j(aais.ay(aanoVar, "aano"), 2418).b(new fjq(5), new defpackage.aabm(2));
    }
}
