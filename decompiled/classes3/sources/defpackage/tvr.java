package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tvr extends defpackage.tvs {
    public static defpackage.tvr a;

    @Override // defpackage.tvs
    public final aec a() {
        return mip.a("rus");
    }

    @Override // defpackage.tvs
    public final j$.util.Optional b(char c) {
        char lowerCase = java.lang.Character.toLowerCase(c);
        return d(lowerCase) ? j$.util.Optional.of(java.lang.Character.valueOf(lowerCase)) : j$.util.Optional.empty();
    }
}
