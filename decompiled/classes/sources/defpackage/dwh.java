package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dwh {
    final android.content.res.ColorStateList a;
    final android.content.res.Configuration b;
    final int c;
    final int d;

    public dwh(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
        this.d = configuration.uiMode;
    }
}
