package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lnr {
    public static final defpackage.aihd a = defpackage.aihd.t(2022, 10001, 2063, 2078);
    public final defpackage.aoin b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;

    public lnr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
    }

    public static boolean a(j$.util.Optional optional) {
        if (true == optional.isPresent()) {
            optional = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((java.lang.Integer) optional.get()).intValue() == 1989));
        }
        return ((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue();
    }
}
