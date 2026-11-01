package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aiub extends defpackage.aiuc {
    public final java.lang.String toString() {
        ahym ahymVar = new ahym("exponentialBackoff");
        ahymVar.f("firstDelayMs", this.b.toMillis());
        ahymVar.d("multiplier", this.c);
        ahymVar.e("tries", this.a);
        return ahymVar.toString();
    }
}
